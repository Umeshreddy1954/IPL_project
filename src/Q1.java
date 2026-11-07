import java.util.TreeMap;
import java.util.Map;
import java.util.List;

public class Q1 {

//    Finding number of matches played per year of all the years in IPL.

    public Map<Integer,Integer> matchesPerYear(List<Matches> m){
        Map<Integer,Integer> h=new TreeMap<>();
        for(Matches match:m){
            h.put(match.getSeason(),h.getOrDefault(match.getSeason(),0)+1);
        }
        return h;
    }
}
