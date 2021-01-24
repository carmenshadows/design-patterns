package decorator;

public class SimpleHouse implements House {

    @Override
    public void operation() {
        System.out.println("initialize simple house");
    }
}
