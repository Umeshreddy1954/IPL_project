import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Q2 {
    public Map<String,Integer> teamMatches(List<Matches> lst){
        Map<String,Integer> h=new HashMap<>();
        for(Matches m:lst){
            h.put(m.getWinner(),h.getOrDefault(m.getWinner(),0)+1);
        }
        return h;
    }
}
