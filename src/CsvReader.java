import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

//    reading matches.csv

    public List<Matches> readMatches(String filepath){
        List<Matches> lst=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(filepath))){
            br.readLine();
            String line;
            while((line=br.readLine())!=null){
                String[] data=line.split(",",-1);
                int id = Integer.parseInt(data[0]);
                int season = Integer.parseInt(data[1]);
                String city = data[2];
                LocalDate date = LocalDate.parse(data[3]);
                String team1 = data[4];
                String team2 = data[5];
                String tossWinner = data[6];
                String tossDecision = data[7];
                String result = data[8];
                int dlApplied = Integer.parseInt(data[9]);
                String winner = data[10];
                int winByRuns = Integer.parseInt(data[11]);
                int winByWickets = Integer.parseInt(data[12]);
                String playerOfMatch = data[13];
                String venue = data[14];
                String umpire1 = data[15];
                String umpire2 = data[16];
                Matches match = new Matches(
                        id, season, city, date,
                        team1, team2, tossWinner,
                        tossDecision, result, dlApplied,
                        winner, winByRuns, winByWickets,
                        playerOfMatch, venue, umpire1,
                        umpire2
                );
                lst.add(match);

            }
        }
        catch(Exception e) {
            throw new RuntimeException("There is an Error while reading matches.csv "+filepath,e);
        }
        return lst;
    }


//     reading deliveries.csv


    public List<Deliveries> readDeliveries(String filepath){
        List<Deliveries> lst=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(filepath))){
            br.readLine();
            String line;
            while((line=br.readLine())!=null){
                String[] data=line.split(",",-1);
                int matchId = Integer.parseInt(data[0]);
                int inning = Integer.parseInt(data[1]);
                String battingTeam = data[2];
                String bowlingTeam = data[3];
                int over = Integer.parseInt(data[4]);
                int ball = Integer.parseInt(data[5]);
                String batsman = data[6];
                String nonStriker = data[7];
                String bowler = data[8];
                int isSuperOver = Integer.parseInt(data[9]);
                int wideRuns = Integer.parseInt(data[10]);
                int byeRuns = Integer.parseInt(data[11]);
                int legbyeRuns = Integer.parseInt(data[12]);
                int noballRuns = Integer.parseInt(data[13]);
                int penaltyRuns = Integer.parseInt(data[14]);
                int batsmanRuns = Integer.parseInt(data[15]);
                int extraRuns = Integer.parseInt(data[16]);
                int totalRuns = Integer.parseInt(data[17]);
                String playerDismissed = data[18];
                String dismissalKind = data[19];
                String fielder = data[20];
                Deliveries delivery = new Deliveries(
                        matchId, inning, battingTeam,
                        bowlingTeam, over, ball,
                        batsman, nonStriker, bowler,
                        isSuperOver, wideRuns, byeRuns,
                        legbyeRuns, noballRuns, penaltyRuns,
                        batsmanRuns, extraRuns, totalRuns,
                        playerDismissed, dismissalKind,
                        fielder
                );
                lst.add(delivery);
            }
        }
        catch(Exception e) {
            throw new RuntimeException("There is an Error while reading deliveries.csv "+filepath,e);
        }
        return lst;
    }
}

