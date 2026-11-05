import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        csvReader mr=new csvReader();
        String matches_file_path="resources/matches.csv";
        String deliveries_file_path="resources/deliveries.csv";
        List<Matches> matchList=mr.matchreader(matches_file_path);
        List<Deliveries> deliveryList=mr.deliveryreader(deliveries_file_path);
//        System.out.print(matchList);

//        question 1:

//        Q1 q1=new Q1();
//        Map<Integer,Integer> h=q1.matchesPerYear(matchList);
//        int sum=0;
//        for(int key:h.keySet()){
//            System.out.println(key+" "+h.get(key));
//            sum+=h.get(key);
//        }
//        System.out.println(sum);

//        question 2:

//        Q2 q2=new Q2();
//        Map<String,Integer> h=q2.teamMatches(matchList);
//        int sum=0;
//        for(String key:h.keySet()){
//            System.out.println(key+" "+h.get(key));
//            sum+=h.get(key);
//        }
//        System.out.println(sum);

//        question 3:
        

    }
}
