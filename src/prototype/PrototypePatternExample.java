package prototype;

public class PrototypePatternExample {

    public static void main(String[] args) throws CloneNotSupportedException {

        Shape circle = new Circle();
        circle.type = "circle";
        Square square = new Square();
        square.type = "square";

        Shape shape;
        shape = circle.clone();
        System.out.println(shape.type);

        shape = square.clone();
        System.out.println(shape.type);
    }
}
