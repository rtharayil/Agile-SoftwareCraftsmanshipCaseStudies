public class OrderItem extends LocalEntity { 
    private Order order;
    private ProductId product;
    private String description;
    private int quantity;
    private Money price;
    private Money subTotal;

    OrderItem(Long id, Order order) {
        super(id);
        this.order = Objects.requireNonNull(order);
        this.quantity = 0;
        this.price = Money.ZERO;
        recalculateSubTotal();
    }

    private void recalculateSubTotal() {
        Money oldSubTotal = this.subTotal;
        this.subTotal = price.multiply(quantity);
        if (oldSubTotal != null && !oldSubTotal.equals(this.subTotal)) {
            this.order.recalculateTotals(); // Invoke aggregate root to enforce invariants
        }
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
        recalculateSubTotal();
    }

    public void setPrice(Money price) {
        Objects.requireNonNull(price, "price must not be null");
        this.price = price;
        recalculateSubTotal();
    }

    // Getters and other setters omitted
}