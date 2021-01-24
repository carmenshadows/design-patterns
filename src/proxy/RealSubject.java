package proxy;

public class RealSubject extends Subject {

    public RealSubject() {
        expensiveOperation();
    }

    @Override
    void operation() {
        System.out.println("operation in real subject");
    }

    private void expensiveOperation() {
        System.out.println("expensive operation");
    }
}
