package App.Service;

import App.DTO.Purchase;
import App.DTO.PurchaserResponse;
import App.Entity.Customer;
import App.Entity.Order;
import App.Entity.OrderItem;
import App.Repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
@Transactional
public class CheckoutServiceImpl implements CheckoutService{

    private final CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public PurchaserResponse placeOrder(Purchase purchase) {

        Order order = purchase.getOrder();
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);
        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(order::add);
        order.setShippingAddress(purchase.getShippingAddress());
        Customer customer = purchase.getCustomer();
        customer.add(order);
        customerRepository.save(customer);
        return new PurchaserResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
