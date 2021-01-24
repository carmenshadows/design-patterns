package decorator;

public class DoorDecorator extends Decorator {

    public DoorDecorator(House house) {
        super(house);
    }

    @Override
    public void operation() {
        super.operation();
        addDoor();
    }

    private void addDoor() {
        System.out.println("add door");
    }
}
