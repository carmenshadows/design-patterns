package simplefactory;

import java.util.Scanner;

public class SimpleFactory {

    public Animal createAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter animal name: ");
        String className = scanner.nextLine();
        Animal animal = null;
        switch (className) {
            case "bird":
                animal = new Bird();
                break;
            case "dog":
                animal = new Dog();
                break;
            default:
                System.out.println("Unknown animal!");
        }
        return animal;
    }

}
