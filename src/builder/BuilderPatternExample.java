package builder;

/**
 * e.g. {@link java.util.Calendar.Builder}
 */
public class BuilderPatternExample {
    public static void main(String[] args) {

        Product car = new CarBuilder()
                .addHeadLights(4)
                .insertWheels(6)
                .buildBody("Carbon")
                .build();

        System.out.println(car);
    }
}
