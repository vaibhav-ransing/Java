package Interfaces;

public interface MyInterface {

    void def();

    default void test(){
        System.out.println("Test in Interface");
    }
    
} 
