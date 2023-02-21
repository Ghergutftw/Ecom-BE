package App.Repository;

import App.Entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
 
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}