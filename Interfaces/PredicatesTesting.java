package Interfaces;

import java.util.function.Predicate;

public class PredicatesTesting {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {

        // boolean v1 = isEven(10);
        // boolean v2 = isEven(11);

        Predicate<Integer> isEvenPredicate = num -> num % 2 == 0;
        boolean v1 = isEvenPredicate.test(10); // True
        boolean v2 = isEvenPredicate.test(11); // False

        Predicate<String> checkLength = s -> s.length() > 5;
        Predicate<String> evenLength = s -> s.length() % 2 == 0;

        System.out.println(checkLength.and(evenLength).test("vaibhav"));
    }
}
