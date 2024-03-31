package Interfaces;

public interface DiamondProblemInterface2 {

    default void m1(){
        System.out.println("This is Interface 2 implementation");
    }

    static void staticMethod(){
        System.out.println("Hello");
    }
}
