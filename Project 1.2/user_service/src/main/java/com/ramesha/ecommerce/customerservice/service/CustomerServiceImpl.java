package com.ramesha.ecommerce.customerservice.service;

import com.ramesha.ecommerce.customerservice.model.Address;
import com.ramesha.ecommerce.customerservice.model.User;
import com.ramesha.ecommerce.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public User saveCutomer(User user) {
        for (Address address : user.getAddresses()){
            address.setUser(user);
        }
        return customerRepository.save(user);
    }

    @Override
    public Optional<User> findById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public User updateCustomer(Integer id, User user1) {
        User user = customerRepository.findById(id).get();
        user.setFname(user1.getFname());
        user.setLname(user1.getLname());
        user.setAddresses(user1.getAddresses());
        user.setLogin(user1.getLogin());
        return customerRepository.save(user);
    }
}
