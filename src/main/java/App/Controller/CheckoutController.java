package App.Controller;

import App.DTO.Purchase;
import App.DTO.PurchaserResponse;
import App.Service.CheckoutService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaserResponse placeOrder(@RequestBody Purchase purchase){
        PurchaserResponse purchaserResponse = checkoutService.placeOrder(purchase);
        return purchaserResponse;
    }
}
