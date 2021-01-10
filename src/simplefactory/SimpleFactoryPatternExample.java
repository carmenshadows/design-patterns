package simplefactory;

import java.text.NumberFormat;

/**
 * e.g. {@link NumberFormat#getInstance()}
 */
public class SimpleFactoryPatternExample {

    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        Animal firstAnimal = simpleFactory.createAnimal();
        firstAnimal.speak();
        Animal secondAnimal = simpleFactory.createAnimal();
        secondAnimal.speak();

    }
}
