package abstractfactory;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("dog speaking!");
    }
}