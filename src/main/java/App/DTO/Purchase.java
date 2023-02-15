package App.DTO;

import App.Entity.Address;
import App.Entity.Customer;
import App.Entity.Order;
import App.Entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
