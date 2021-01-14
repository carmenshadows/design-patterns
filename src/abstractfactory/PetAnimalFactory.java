package abstractfactory;

public class PetAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String type) {
        Animal animal;
        switch (type) {
            case "Bird":
                animal = new Bird();
                break;
            case "Dog":
                animal = new Dog();
                break;
            default:
                animal = null;
                break;
        }
        return animal;
    }
}
