import java.util.ArrayList;
import java.util.List;

public class Order {
<<<<<<< HEAD

=======
    private List<OrderObserver> observers =new ArrayList<>();
    private double itemCost;
    private int itemCount;
    private int shippingCost = 10;
    private double totalPrice;
    private int id;

    public Order() {
    }
    public Order(int id) {
        this.id = id;
    }

    public void addItem(double price, int quantity) {
        this.itemCost += price;
        this.itemCount += quantity;
        this.notifyObservers();
    }
    public void notifyObservers() { this.observers.forEach(observer -> observer.update(this)); }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getItemCost() { return itemCost; }
    public void setItemCost(double itemCost) { this.itemCost = itemCost; }
    public int getItemCount() { return itemCount; }
    public void setItemCount(int itemCount) { this.itemCount = itemCount; }
    public int getShippingCost() { return shippingCost; }
    public void setShippingCost(int shippingCost) { this.shippingCost = shippingCost; }
    public double getTotalPrice() { return itemCost * itemCount + shippingCost; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }
    public void attach(OrderObserver observer) {
        this.observers.add(observer);
    }
    public void detach(OrderObserver observer) {
        this.observers.remove(observer);
    }
>>>>>>> feature
}
