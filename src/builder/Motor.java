package builder;

public class Motor extends Product implements Builder {
    private String name;
    private Product product;

    public Motor(String name) {
        this.name = name;
        product = new Product();
    }

    @Override
    public void start() {
        product.add("started to build motor " + name);
    }

    @Override
    public void buildBody() {
        product.add("body of the motor");
    }

    @Override
    public void insertWheels() {
        product.add("two wheels inserted");
    }

    @Override
    public void addHeadLights() {
        product.add("one wheels added");
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
