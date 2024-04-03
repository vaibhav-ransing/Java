import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaQuestionWordOcc {

    public static void findDuplicates() {
        int[] arr = { 1, 2, 5, 3, 2, 9, 1 };
        HashSet<Integer> set = new HashSet<>();

        // set.add return a boolean value if added. here we check if not added then
        // filter it out.
        Arrays.stream(arr).filter(val -> !set.add(val)).forEach(val -> System.out.println(val));
    }

    // write a program to multiply 2 no. using functional interface

    public static void multiplyUsingFunctionalInterface() {
        int a = 5;
        int b = 6;

        BiFunction<Integer, Integer, Integer> biFunction = ((a1, b1) -> a1 * b1);
        System.out.println(biFunction.apply(a, b));

        // using out own functional interface
        myFuctionalInterface fuctionalInterface = (x, y) -> x * y;
        System.out.println(fuctionalInterface.multiply(a, b));
    }

    // str = "welcome to code decode and code decode welcome you"
    // given a string print a map out of its word with count
    // code=2, and=1, to=1, decode=2, welcome=2, you=2

    public static void getWordCount() {
        String str = "welcome to code decode and code decode welcome you";
        List<String> list = Arrays.asList(str.split(" "));
        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static boolean primeCheck() {
        int number = 7;
        boolean isPrime = number > 1 && IntStream.range(2, number).noneMatch(n -> number % n == 0);
        return isPrime;
    }

    public static void main(String[] args) {

        multiplyUsingFunctionalInterface();

        Optional.of(1);
    }
}

/**
 * myFu
 */
@FunctionalInterface
interface myFuctionalInterface {

    public int multiply(int a, int b); // by default it is public
}