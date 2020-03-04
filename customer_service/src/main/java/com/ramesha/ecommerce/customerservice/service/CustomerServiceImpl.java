package com.ramesha.ecommerce.customerservice.service;

import com.ramesha.ecommerce.customerservice.model.Address;
import com.ramesha.ecommerce.customerservice.model.Customer;
import com.ramesha.ecommerce.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer saveCutomer(Customer customer) {
        for (Address address : customer.getAddresses()){
            address.setCustomer(customer);
        }
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer updateCustomer(Integer id,Customer customer1) {
        Customer customer = customerRepository.findById(id).get();
        customer.setFname(customer1.getFname());
        customer.setLname(customer1.getLname());
        customer.setAddresses(customer1.getAddresses());
        customer.setLogin(customer1.getLogin());
        return customerRepository.save(customer);
    }
}
