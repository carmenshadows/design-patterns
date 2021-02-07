package flyweight;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {

    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(String flavour, int tableNo) {
        orderList.add(Order.of(flavour, tableNo));
    }

    public void service() {
        orderList.forEach(Order::serve);
    }
}
