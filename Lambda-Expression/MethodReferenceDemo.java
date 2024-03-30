import java.util.function.BiConsumer;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        // Test test = new Test();
        // BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        // biConsumer.accept(10, 20);

        // FunctionalInterfaceDemo functionalInterfaceDemo = () -> System.out.println("Hello This is called after calling single Abs Method");
        // functionalInterfaceDemo.printName();
        // functionalInterfaceDemo.singleAbsMethod();

        // String name = functionalInterfaceDemo.returnName();

        // Method referencing is done with ::
        // In the below code testMethod is statitic method and can be used directly
        // So singleAbsMethod is refering testMethod
        FunctionalInterfaceDemo functionalInterfaceDemo = Test :: testMethod;
        functionalInterfaceDemo.singleAbsMethod();

    }

}

class Test {

    public static void testMethod() {
        System.out.println("This is test method");
    }
}
