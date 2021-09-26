public class OrderShipped implements DomainEvent {
    private final OrderId order;
    private final Instant occurredOn;

    public OrderShipped(OrderId order, Instant occurredOn) {
        this.order = order;
        this.occurredOn = occurredOn;
    }

    // Getters omitted
}