package Interfaces;

import java.util.function.Function;

public class FUnctionDemo {
    


    public static void main(String[] args) {
        Function<Integer, Integer> square = num -> num*num;
        // System.out.println(square.apply(4));

        Function<Integer, Integer> divideBy2 = num -> num/2;

        /* In the below we first pass the value 5 to square and then divideBy2 */
        int val = square.andThen(divideBy2).apply(5);
        System.out.println(val);

        System.out.println(square.compose(divideBy2).apply(5));
    }
}
