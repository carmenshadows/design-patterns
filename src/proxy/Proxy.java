package proxy;

public class Proxy extends Subject {

    private RealSubject realSubject;

    @Override
    void operation() {
        System.out.println("in proxy");

        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.operation();
    }

}
