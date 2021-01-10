package builder;

public class Car extends Product implements Builder {
    private String name;
    private Product product;

    public Car(String name) {
        this.name = name;
        product = new Product();
    }

    @Override
    public void start() {
        product.add("started to build car " + name);
    }

    @Override
    public void buildBody() {
        product.add("body the car");
    }

    @Override
    public void insertWheels() {
        product.add("four wheels inserted");
    }

    @Override
    public void addHeadLights() {
        product.add("two head lights added");
    }

    @Override
    public void stop() {
        product.add("stopped");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
