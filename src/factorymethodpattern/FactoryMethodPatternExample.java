package factorymethodpattern;

public class FactoryMethodPatternExample {
    public static void main(String[] args) {


        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speak();

        AnimalFactory birdFactory = new BirdFactory();
        Animal bird = birdFactory.createAnimal();
        bird.speak();

        // e.g
        // java.net.URLStreamHandlerFactory.createURLStreamHandler()
    }
}
