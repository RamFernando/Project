package com.ramesha.ecommerce.cartservice.service;

import com.ramesha.ecommerce.cartservice.model.Cart;
import com.ramesha.ecommerce.cartservice.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }
}
