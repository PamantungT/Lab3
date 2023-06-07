public class QuantityObserver extends OrderObserver {

    public void update() { }

    public QuantityObserver() {
    }

    public void update(Order order) {
        if (order.getItemCount() > 5) {
            order.setShippingCost(0);
            System.out.println("Quantity update ! New shipping cost of " + order.getShippingCost() + " !");
        }
    }
}
