package decorator;

public abstract class Decorator implements House {

    private final House house;

    public Decorator(House house) {
        this.house = house;
    }

    @Override
    public void operation() {
        house.operation();
    }
}
