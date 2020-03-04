package com.ramesha.ecommerce.customerservice.controller;

import com.ramesha.ecommerce.customerservice.model.Customer;
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
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCutomer(customer);
    }

    @RequestMapping(value = "/customer/{id}")
    public Optional<Customer> getCustomerById(@PathVariable("id") int id){
        return customerService.findById(id);
    }

    @RequestMapping(value = "/customer/update/{id}")
    public Customer updateCustomer(@PathVariable("id") int id,@RequestBody Customer customer){
        return customerService.updateCustomer(id, customer);
    }
}
