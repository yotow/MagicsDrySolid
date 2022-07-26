import java.util.List;

public class ClientOrders {
    List<Order> orders;
    int totalPrice;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrder(Order order) {
        this.orders.add(order);
        this.totalPrice += order.getPrice();
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
