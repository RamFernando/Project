package com.ramesha.ecommerce.customerservice.service;

import com.ramesha.ecommerce.customerservice.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Customer saveCutomer(Customer customer);
    Optional<Customer> findById(Integer id);
    Customer updateCustomer(Integer id, Customer customer);
}
