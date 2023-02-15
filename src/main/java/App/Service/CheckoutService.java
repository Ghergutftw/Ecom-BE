package App.Service;

import App.DTO.Purchase;
import App.DTO.PurchaserResponse;

public interface CheckoutService {

    PurchaserResponse placeOrder(Purchase purchase);
}
