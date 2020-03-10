package com.ramesha.ecommerce.customerservice.service;

import com.ramesha.ecommerce.customerservice.model.User;

import java.util.Optional;

public interface CustomerService {
    User saveCutomer(User user);
    Optional<User> findById(Integer id);
    User updateCustomer(Integer id, User user);
}
