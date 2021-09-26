public class Order extends AggregateRoot<OrderId> {

    // Other methods omitted

    public void ship() {
        // Do some business logic
        registerEvent(new OrderShipped(this.getId(), Instant.now()));
    }
}