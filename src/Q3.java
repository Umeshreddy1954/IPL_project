import java.util.*;

public class Q3 {

//    Finding the extra runs conceded per team for the year 2016.

    public Map<String, Integer> extraruns(List<Matches> matchList, List<Deliveries> deliveryList) {
        Map<String,Integer> h=new HashMap<>();
        Set<Integer> seasonIds=new HashSet<>();
        for(Matches m:matchList){
            if(m.getSeason()==2016){
                seasonIds.add(m.getId());
            }
        }
        for(Deliveries delivery:deliveryList){
            if(seasonIds.contains(delivery.getMatchId())){
                h.put(delivery.getBowlingTeam(),h.getOrDefault(delivery.getBowlingTeam(),0)+ delivery.getExtraRuns());
            }
        }

        return h;
    }
}
