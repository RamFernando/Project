package com.ramesha.ecommerce.cartservice.service;

import com.ramesha.ecommerce.cartservice.model.Checkout;
import com.ramesha.ecommerce.cartservice.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    CheckoutRepository checkoutRepository;

    @Override
    public Checkout addCheckout(Checkout checkout) {
        return checkoutRepository.save(checkout);
    }
}
