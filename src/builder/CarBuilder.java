package builder;

public class CarBuilder implements Builder {
    private String start = "started";
    private String bodyType = "steel";
    private int numberOfWheels = 4;
    private int numberOfHeadLights = 2;
    private String stop = "stopped";
    Product product;


    @Override
    public Builder start(String message) {
        this.start = message;
        return this;
    }

    @Override
    public Builder buildBody(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public Builder insertWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    @Override
    public Builder addHeadLights(int numberOfHeadLights) {
        this.numberOfHeadLights = numberOfHeadLights;
        return this;
    }

    @Override
    public Builder stop(String message) {
        this.stop = message;
        return this;
    }

    @Override
    public Product build() {
        product = new Product(this.start, this.bodyType, this.numberOfWheels, this.numberOfHeadLights, this.stop);
        return product;
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
