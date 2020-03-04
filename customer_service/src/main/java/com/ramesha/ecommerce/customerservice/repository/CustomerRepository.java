package com.ramesha.ecommerce.customerservice.repository;

import com.ramesha.ecommerce.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
