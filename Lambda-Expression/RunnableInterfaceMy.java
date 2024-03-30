@FunctionalInterface
public interface RunnableInterfaceMy<T, U> {
    
    void accept(T t, U u);

    default String printHello() {
        System.out.println("Hello");
        return "acb";
    }
}
