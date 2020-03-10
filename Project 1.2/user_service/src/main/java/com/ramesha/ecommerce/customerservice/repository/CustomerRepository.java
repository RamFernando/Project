package com.ramesha.ecommerce.customerservice.repository;

import com.ramesha.ecommerce.customerservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<User,Integer> {
}
