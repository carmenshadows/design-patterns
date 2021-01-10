package factorymethod;

/**
 * "closed for modification but open for extension" principle.
 */
public class FactoryMethodPatternExample {
    public static void main(String[] args) {


        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speak();

        AnimalFactory birdFactory = new BirdFactory();
        birdFactory.makeAnimal();

        // e.g
        // java.net.URLStreamHandlerFactory.createURLStreamHandler()
    }
}
