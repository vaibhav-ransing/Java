public class FunctionalInterfaceUsage {
    



    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo = () -> System.out.println("Hello This is called after calling single Abs Method");
        functionalInterfaceDemo.printName();
        functionalInterfaceDemo.singleAbsMethod();
        
        String name = functionalInterfaceDemo.returnName();
    }
}
