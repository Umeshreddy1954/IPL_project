import java.util.*;

public class Main {
    public static void main(String[] args){
        csvReader mr=new csvReader();
        Scanner sc=new Scanner(System.in);
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
//        Q3 q3=new Q3();
//        Map<String,Integer> h=q3.extraruns(matchList,deliveryList);
//        int sum=0;
//        for(String key:h.keySet()){
//            System.out.println(key+" "+h.get(key));
//            sum+=h.get(key);
//        }
//        System.out.println(sum);


//        question 4:

        Q4 q4=new Q4();
        int k=sc.nextInt();
        PriorityQueue<Economy> pq=q4.economicbowlers(matchList,deliveryList,k);
        ArrayList<Economy> arr=new ArrayList<>(pq);
        arr.sort(Comparator.comparingDouble(Economy::getEconomyRate));
        for(Economy e:arr){
            System.out.println(e.getName()+" "+e.getEconomyRate());
        }
    }
}
