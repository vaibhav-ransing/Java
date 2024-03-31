package Interfaces;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceDemo {
    


    public static void main(String[] args) {
        
        // Consumer<String> com = s -> System.out::println;
        Consumer<String> com = s -> System.out.println(s);
        com.accept("Hello Vaibhav");
        
        Consumer<Integer> doubleMe = i -> System.out.println("This is double Integer "+  i*2);
        Consumer<Integer> SquareMe = i -> System.out.println("This is Squared Integer "+  i*i );

        doubleMe.andThen(SquareMe).accept(5);

    }
}
