import java.util.*;

public class Q4 {
    public PriorityQueue<Economy> economicbowlers(List<Matches> matchList, List<Deliveries> deliveryList, int k) {
        Map<String, int[]> bowlerlist = new HashMap<>();
        PriorityQueue<Economy> pq = new PriorityQueue<>(
                (a, b) ->
                        Double.compare(b.getEconomyRate(), a.getEconomyRate()));
        Set<Integer> seasonIds = new HashSet<>();
        for (Matches m : matchList) {
            if (m.getSeason() == 2015) {
                seasonIds.add(m.getId());
            }
        }
        for (Deliveries d : deliveryList) {
            if (seasonIds.contains(d.getMatchId())) {
                int runsconceded = 0;
                int legal = 0;
                if (d.getWideRuns() == 0 && d.getNoballRuns() == 0) {
                    legal += 1;
                }
                runsconceded += d.getBatsmanRuns() + d.getWideRuns() + d.getNoballRuns();
                int[] stats = bowlerlist.getOrDefault(d.getBowler(), new int[2]);
                stats[0] += runsconceded;
                stats[1] += legal;
                bowlerlist.put(d.getBowler(), stats);
            }
        }
        for (Map.Entry<String, int[]> e : bowlerlist.entrySet()) {
            int runs = e.getValue()[0];
            int legals = e.getValue()[1];
            double economyrate = (1.0 * runs * 6) / (double) (legals==0?1:legals);
            pq.offer(new Economy(e.getKey(), economyrate));
            if (pq.size() > k) {
                pq.poll();
            }

        }
        return pq;
    }
}
