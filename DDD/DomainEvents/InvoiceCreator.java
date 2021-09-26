public class InvoiceCreator {

    final OrderRepository orderRepository;
    final InvoiceRepository invoiceRepository;

    // Constructor omitted

    @DomainEventListener
    @Transactional
    public void onOrderShipped(OrderShipped event) {
        var order = orderRepository.find(event.getOrderId());
        var invoice = invoiceFactory.createInvoiceFor(order);
        invoiceRepository.save(invoice);
    }
}