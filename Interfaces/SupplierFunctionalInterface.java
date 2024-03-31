package Interfaces;

import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    

    public static void main(String[] args) {
        Supplier<Date> currDate = () -> new Date();
        System.out.println(currDate.get());

        BiPredicate<Integer, Integer> checkTwoSum = (a,b) -> (a+b)>5;
        System.out.println(checkTwoSum.test(2, 2));  // False

        BiFunction<Integer, Integer, Integer> multiplyNumbers = (a,b) -> a*b;
        System.out.println(multiplyNumbers.apply(10, 3));

        // ClassName cn = ClassName.builder().age(10).name(vaibhav).build();
        
    }
}

class ClassName{

    String name;
    int age;

    private ClassName(){

    }

    // static ClassName builder(){

    // }
}