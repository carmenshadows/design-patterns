package flyweight;

public interface Order {

    void serve();

    static Order of(String flavourName, int tableNumber) {
        CoffeeFlavour flavour = CoffeeFlavour.getCoffeeFlavour(flavourName);
        return () -> System.out.printf("(Flavour: %s, Table no: %s)%n", flavour, tableNumber);
    }
}
