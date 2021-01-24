package decorator;

public class WindowDecorator extends Decorator {

    public WindowDecorator(House house) {
        super(house);
    }

    @Override
    public void operation() {
        super.operation();
        addWindow();
    }

    private void addWindow() {
        System.out.println("add window");
    }
}
