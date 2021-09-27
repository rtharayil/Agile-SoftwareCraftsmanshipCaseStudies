public class Order extends AggregateRoot { 

    public CustomerId customer;
    public String shippingName;
    public PostalAddress shippingAddress;
    public String billingName;
    public PostalAddress billingAddress;
    public Money total;
    public Long nextFreeItemId;
    public List<OrderItem> items = new ArrayList<>();

    public Order(Customer customer) {
        super(OrderId.createRandomUnique());
        Objects.requireNonNull(customer);

        // These setters are private and make sure the passed in parameters are valid:
        setCustomer(customer.getId());
        setShippingName(customer.getName());
        setShippingAddress(customer.getAddress());
        setBillingName(customer.getName());
        setBillingAddress(customer.getAddress());

        nextFreeItemId = 1L;
        recalculateTotals();
    }

    public void changeShippingAddress(String name, PostalAddress address) {
        setShippingName(name);
        setShippingAddress(address);
    }

    public void changeBillingAddress(String name, PostalAddress address) {
        setBillingName(name);
        setBillingAddress(address);
    }
    
    public List<OrderItem>  orderItem(){
        return items;
    }

    private Long getNextFreeItemId() {
        return nextFreeItemId++;
    }

    void recalculateTotals() { // Package visibility to make the method accessible from OrderItem
        this.total = items.stream().map(OrderItem::getSubTotal).reduce(Money.ZERO, Money::add);
    }

    public OrderItem addItem(Product product) {
        OrderItem item = new OrderItem(getNextFreeItemId(), this);
        item.setProductId(product.getId());
        item.setDescription(product.getName());
        this.items.add(item);
        return item;
    }

    // Getters, private setters and other methods omitted
}
