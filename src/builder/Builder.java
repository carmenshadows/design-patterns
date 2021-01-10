package builder;

public interface Builder {
    Builder start(String message);

    Builder buildBody(String bodyType);

    Builder insertWheels(int numberOfWheels);

    Builder addHeadLights(int numberOfHeadLights);

    Builder stop(String message);

    Product build();

    Product getVehicle();
}
