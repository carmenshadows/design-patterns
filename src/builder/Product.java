package builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> parts;

    public Product() {
        this.parts = new ArrayList<>();
    }

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("completed: ");
        parts.forEach(System.out::println);
    }
}
