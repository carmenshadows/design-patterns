package decorator;

public class DecoratorExample {

    public static void main(String[] args) {
        SimpleHouse simpleHouse = new SimpleHouse();
        DoorDecorator doorDecorator = new DoorDecorator(simpleHouse);
        WindowDecorator windowDecorator = new WindowDecorator(doorDecorator);
        windowDecorator.operation();
    }
}
