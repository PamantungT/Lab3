public class Main {
    public static void main(String[] args) {

        System.out.println("E-commerce application design challenge");

        // Create instances
        Order order = new Order();
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        // Attach two of my observers
        order.attach(priceObserver);
        order.attach(quantityObserver);

        // Add items
        order.addItem(50, 1);
        order.addItem(20, 2);
        order.addItem(100, 1);
        order.addItem(100, 1);
        order.addItem(100, 1);

        // Try to detach method
        order.detach(priceObserver);

    }
}