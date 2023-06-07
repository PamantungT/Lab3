public class PriceObserver extends OrderObserver {
    public void update() { }
    public PriceObserver() {
    }

    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            order.setTotalPrice(order.getTotalPrice() - 20);
            System.out.println("Price update ! : " + order.getItemCost());
        }
    }
}
