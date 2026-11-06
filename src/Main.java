import java.util.*;

public class Main {
    public static void main(String[] args){
        csvReader mr=new csvReader();
        String matches_file_path="resources/matches.csv";
        String deliveries_file_path="resources/deliveries.csv";
        List<Matches> matchList=mr.matchreader(matches_file_path);
        List<Deliveries> deliveryList=mr.deliveryreader(deliveries_file_path);
        Questions.allquestions(matchList,deliveryList);
    }
}
