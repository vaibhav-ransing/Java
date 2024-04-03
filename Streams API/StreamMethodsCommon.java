import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamMethodsCommon {
    




    public static void main(String[] args) {
        
        
        Stream<Integer> stream = Arrays.asList(4,2,8,6,1,6).stream();
        // System.out.println(stream.count());
        // List<Integer> sorted = stream.sorted((v1, v2) -> v2.compareTo(v1)).toList();
        // System.out.println(sorted);
        // Object[] arrr = stream.toArray();
        // stream.reduce(((a,b) -> a+b)).get();
        
        // Stream<Integer> streamLimited = stream.limit(3);
        int firstGreatThen5 = stream.filter(val -> val>5).findFirst().orElse(-1);
        System.out.println(firstGreatThen5);
    }
}
