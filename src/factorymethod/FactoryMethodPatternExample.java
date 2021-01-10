package factorymethod;

/**
 * "closed for modification but open for extension" principle.
 * e.g. {@link java.net.URLStreamHandlerFactory#createURLStreamHandler(String)}
 */
public class FactoryMethodPatternExample {
    public static void main(String[] args) {


        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speak();

        AnimalFactory birdFactory = new BirdFactory();
        birdFactory.makeAnimal();

    }
}
