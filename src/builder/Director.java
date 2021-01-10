package builder;

public class Director {
    Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
        builder.start();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadLights();
        builder.stop();
    }
}
