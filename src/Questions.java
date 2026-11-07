import java.util.*;

public class Questions {
    public static void allquestions(List<Matches> matchList, List<Deliveries> deliveryList,int numberOfBowlers,int numberOfBatters){


//        question 1: Matches played per year


        System.out.println("---------Question 1");
        Q1 q1=new Q1();
        Map<Integer,Integer> h=q1.matchesPerYear(matchList);
        for(int key:h.keySet()){
            System.out.println(key+" "+h.get(key));
        }
        System.out.println();

//        question 2: Matches won by each team

        System.out.println("---------Question 2");
        Q2 q2=new Q2();
        Map<String,Integer> teamMatchesMap=q2.teamMatches(matchList);
        for(String key:teamMatchesMap.keySet()){
            System.out.println(key+" "+teamMatchesMap.get(key));
        }
        System.out.println();

//        question 3: Extra runs conceded by each team

        System.out.println("---------Question 3");
        Q3 q3=new Q3();
        Map<String,Integer> extraRunsMap=q3.extraruns(matchList,deliveryList);
        for(String key:extraRunsMap.keySet()){
            System.out.println(key+" "+extraRunsMap.get(key));
        }
        System.out.println();


//        question 4: Top economical bowlers

        System.out.println("---------Question 4");
        Q4 q4=new Q4();
        PriorityQueue<Economy> pq_economicBowlers=q4.economicbowlers(matchList,deliveryList,numberOfBowlers);
        ArrayList<Economy> arr_economicBowlers=new ArrayList<>(pq_economicBowlers);
        arr_economicBowlers.sort(Comparator.comparingDouble(Economy::getEconomyRate));
        for(Economy e:arr_economicBowlers){
            System.out.println(e.getName()+" "+e.getEconomyRate());
        }
        System.out.println();

//        Question 5: Top run-scoring batsmen

        System.out.println("---------Question 5");
        Q5 q5=new Q5();
        PriorityQueue<Map.Entry<String,Integer>> pq_topBatter=q5.topbatsman(matchList,deliveryList,numberOfBatters);
        ArrayList<Map.Entry<String,Integer>> arr_topbatters=new ArrayList<>(pq_topBatter);
        arr_topbatters.sort((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<String,Integer> m:arr_topbatters){
             System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
    }
}
