package factorymethod;

public abstract class AnimalFactory {

    // GoF definition: Factory method lets a class defer instantiation to subclasses. Therefore it is abstract method.
    public abstract Animal createAnimal();
}
