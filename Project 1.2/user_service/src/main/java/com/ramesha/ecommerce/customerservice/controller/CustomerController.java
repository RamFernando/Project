package com.ramesha.ecommerce.customerservice.controller;

import com.ramesha.ecommerce.customerservice.model.User;
import com.ramesha.ecommerce.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/services")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/test")
    public String greeting() {
        return "<h1>Hello from Spring Boot</h1>";
    }

    @RequestMapping(value = "/customer/save", method = RequestMethod.POST)
    public User saveCustomer(@RequestBody User user){
        return customerService.saveCutomer(user);
    }

    @RequestMapping(value = "/customer/{id}")
    public Optional<User> getCustomerById(@PathVariable("id") int id){
        return customerService.findById(id);
    }

    @RequestMapping(value = "/customer/update/{id}")
    public User updateCustomer(@PathVariable("id") int id, @RequestBody User user){
        return customerService.updateCustomer(id, user);
    }
}
