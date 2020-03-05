package com.ramesha.ecommerce.productservice.controller;

import com.ramesha.ecommerce.productservice.model.Product;
import com.ramesha.ecommerce.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/test")
    public String test(){
        return "Hello Product";
    }

    @RequestMapping(value = "/product/save",method = RequestMethod.POST)
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
}
