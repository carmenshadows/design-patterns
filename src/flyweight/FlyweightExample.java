package flyweight;

public class FlyweightExample {

    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Frappe", 1);
        shop.takeOrder("Espresso", 1);
        shop.takeOrder("Frappe", 3);
        shop.takeOrder("Espresso", 3);
        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Espresso", 9);
        shop.takeOrder("Frappe", 5);
        shop.takeOrder("Cappuccino", 12);
        shop.takeOrder("Espresso", 12);

        shop.service();
        System.out.println("CoffeeFlavor objects in cache: " + CoffeeFlavour.flavourSize());
    }
}
