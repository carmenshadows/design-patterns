package abstractfactory;

public class WildAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String type) {
        Animal animal;
        switch (type) {
            case "Bird":
                animal = new WildBird();
                break;
            case "Dog":
                animal = new WildDog();
                break;
            default:
                animal = null;
                break;
        }
        return animal;
    }
}
