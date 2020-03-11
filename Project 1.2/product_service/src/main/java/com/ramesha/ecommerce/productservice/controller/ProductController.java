package com.ramesha.ecommerce.productservice.controller;

import com.ramesha.ecommerce.productservice.model.Product;
import com.ramesha.ecommerce.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

//    @RequestMapping(value = "/product/getbyid/{id}")
//    public List<Product> getProducts(@PathVariable Integer id){
//        List<Product> productsByCartId = productService.getProductById(id);
//        return productsByCartId;
//    }
}
