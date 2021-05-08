package com.meb.ecommerce.service;

import com.meb.ecommerce.dto.Purchase;
import com.meb.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
