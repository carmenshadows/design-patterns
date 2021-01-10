package simplefactory;

public class SimpleFactoryPatternExample {

    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        Animal firstAnimal = simpleFactory.createAnimal();
        firstAnimal.speak();
        Animal secondAnimal = simpleFactory.createAnimal();
        secondAnimal.speak();

        // e.g
        // java.text.NumberFormat.getInstance();
    }
}
