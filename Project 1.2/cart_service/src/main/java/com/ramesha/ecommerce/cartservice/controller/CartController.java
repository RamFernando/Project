package com.ramesha.ecommerce.cartservice.controller;

import com.ramesha.ecommerce.cartservice.commonmodel.Product;
import com.ramesha.ecommerce.cartservice.model.Cart;
import com.ramesha.ecommerce.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/services")
public class CartController {

    @Autowired
    CartService cartService;

    @RequestMapping("/testCart")
    public String testCart(){
        return "Hello cart";
    }

    @RequestMapping(value = "/cart/add", method = RequestMethod.POST)
    public Cart saveCart(@RequestBody Cart cart){
        return cartService.addCart(cart);
    }

    @RequestMapping(value = "cart/products/{id}")
    public Cart getAllCarts(@PathVariable int id){
        Cart cart = cartService.fetchCartProducts(id);
        return cart;
    }
}
