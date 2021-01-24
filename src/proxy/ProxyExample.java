package proxy;

public class ProxyExample {

    public static void main(String[] args) {

        Subject subject = new Proxy();
        subject.operation();
    }
}
