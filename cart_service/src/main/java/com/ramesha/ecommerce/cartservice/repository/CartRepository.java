package com.ramesha.ecommerce.cartservice.repository;

import com.ramesha.ecommerce.cartservice.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
}
