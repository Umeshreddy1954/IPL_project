import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Q1 {
    public Map<Integer,Integer> matchesPerYear(List<Matches> m){
        Map<Integer,Integer> h=new HashMap<>();
        for(Matches match:m){
            h.put(match.getSeason(),h.getOrDefault(match.getSeason(),0)+1);
        }
        return h;
    }
}
