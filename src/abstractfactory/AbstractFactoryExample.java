package abstractfactory;

public class AbstractFactoryExample {

    public static void main(String[] args) {

        AnimalFactory animalFactory;
        Animal animal;

        animalFactory = new WildAnimalFactory();
        animal = animalFactory.createAnimal("Dog");
        animal.speak();

        animalFactory = new PetAnimalFactory();
        animal = animalFactory.createAnimal("Bird");
        animal.speak();
    }
}
