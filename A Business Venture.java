import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String username;
    private List<Integer> orderHistory;

    public Customer(int id, String username) {
        this.id = id;
        this.username = username;
        this.orderHistory = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public List<Integer> getOrderHistory() {
        return orderHistory;
    }

    public void addOrderToHistory(int orderId) {
        orderHistory.add(orderId);
    }

    public void removeOrderFromHistory(int orderId) {
        orderHistory.remove((Integer) orderId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", orderHistory=" + orderHistory +
                '}';
    }

    public static void main(String[] args) {
        // Create a new customer
        Customer customer = new Customer(1, "Anurag");
       

        // Add some orders to the customer's history
        customer.addOrderToHistory(101);
        customer.addOrderToHistory(102);
        customer.addOrderToHistory(103);

        // Print the customer's information
        System.out.println(customer.toString());
    }
}
