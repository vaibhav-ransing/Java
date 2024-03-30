@FunctionalInterface
public interface FunctionalInterfaceDemo {

    /* This is an abstract method, there can be only one method lie this */
    void singleAbsMethod(); 

    
    /* All the methods below has default or static before it's declaration */

    default void printName(){
        System.out.println("This is functionalInterfaceDemo printName method");
    }
    
    default String returnName(){
        return "Vaibahv Here From Functional Interface";
    }

    static void staticMethod(){  
        System.out.println("This is static method functional Interface");
    }

}
