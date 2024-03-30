import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basics {

    public static void addNumbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        // Basics basics = new Basics();
        // basics.addNumbers(10, 20);

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(10, 20);

        // List<Integer> list = List.of(1,2,2,4,1,5,7,3);

        // Set<String> uniqueElements = new HashSet<>();

        // Set<Integer> duplicates = list.stream().filter(e ->
        // !uniqueElements.contains(e)).collect(Collectors.toSet());

        Stream<String> stream = Stream.of("apple", "banana", "apple", "orange", "banana");

        Set<String> uniqueElements = new HashSet<>();
        Set<String> duplicates = stream.filter(e -> !uniqueElements.add(e))  // .add return boolean, if uniqueElemts already has the value it wont add and will return false and here we convert it to true.
                .collect(Collectors.toSet());

        System.out.println("Duplicate elements: " + duplicates);

    }

}
