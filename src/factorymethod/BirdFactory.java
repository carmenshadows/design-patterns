package factorymethod;

public class BirdFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Bird();
    }
}
