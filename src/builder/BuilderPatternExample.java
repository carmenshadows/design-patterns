package builder;

/**
 * e.g. {@link java.util.Calendar.Builder}
 */
public class BuilderPatternExample {
    public static void main(String[] args) {
        Director director = new Director();
        Builder audiBuilder = new Car("Audi");
        director.construct(audiBuilder);
        Product audi = audiBuilder.getVehicle();
        audi.show();

        Builder hondaBuilder = new Motor("Honda");
        director.construct(hondaBuilder);
        Product honda = hondaBuilder.getVehicle();
        honda.show();

    }
}
