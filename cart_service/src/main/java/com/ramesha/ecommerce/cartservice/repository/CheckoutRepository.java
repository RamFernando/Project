package com.ramesha.ecommerce.cartservice.repository;

import com.ramesha.ecommerce.cartservice.model.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout,Integer> {
}
