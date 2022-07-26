import java.util.Objects;

public class Client {
    //magic number
    private static final int STARTING_COUNT_ORDERS = 2;
    private final ClientOrders orders = new ClientOrders();
    private String phoneNumber;
    private String name;
    private String address;
    private int maxCountOrders = STARTING_COUNT_ORDERS;
    private int id;

    public Client(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        id = Objects.hashCode(name + phoneNumber + address);

    }

    public ClientOrders getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.setOrder(order);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMaxCountOrders() {
        return maxCountOrders;
    }

    public void up() {
        if (maxCountOrders < 20) {
            this.maxCountOrders++;
        }
    }

    public void down() {
        if (maxCountOrders > 0) {
            maxCountOrders--;
        }
    }
}
