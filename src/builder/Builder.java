package builder;

public interface Builder {
    void start();

    void buildBody();

    void insertWheels();

    void addHeadLights();

    void stop();

    Product getVehicle();
}
