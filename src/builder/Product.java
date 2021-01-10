package builder;

public class Product {

    private String start;
    private String bodyType;
    private int numberOfWheels;
    private int numberOfHeadLights;
    private String stop;

    public Product(String start, String bodyType, int numberOfWheels, int numberOfHeadLights, String stop) {
        this.start = start;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.numberOfHeadLights = numberOfHeadLights;
        this.stop = stop;
    }

    @Override
    public String toString() {
        return "Product{" +
                "start='" + start + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", numberOfHeadLights=" + numberOfHeadLights +
                ", stop='" + stop + '\'' +
                '}';
    }
}
