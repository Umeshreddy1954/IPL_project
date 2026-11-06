import java.util.*;

public class Q5 {
//    For the year 2016, finding the top 5 batsmen who scored the most runs across all matches
    public PriorityQueue<Map.Entry<String,Integer>> topbatsman(List<Matches> matchList, List<Deliveries> deliveryList,int k){
        Set<Integer> seasonIds=new HashSet<>();
        for (Matches m : matchList) {
            if (m.getSeason() == 2016) {
                seasonIds.add(m.getId());
            }
        }
        Map<String,Integer> batsman=new HashMap<>();
        for (Deliveries d : deliveryList){
            if(seasonIds.contains(d.getMatchId())){
                batsman.put(d.getBatsman(),batsman.getOrDefault(d.getBatsman(),0)+d.getBatsmanRuns());
            }
        }
        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>(
                (a,b)-> a.getValue()-b.getValue()
                );
        for(Map.Entry<String,Integer> e:batsman.entrySet()) {
            pq.add(e);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq;
    }

}
