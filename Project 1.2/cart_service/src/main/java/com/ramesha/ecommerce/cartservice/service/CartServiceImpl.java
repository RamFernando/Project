package com.ramesha.ecommerce.cartservice.service;

import com.ramesha.ecommerce.cartservice.commonmodel.Product;
import com.ramesha.ecommerce.cartservice.model.Cart;
import com.ramesha.ecommerce.cartservice.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart fetchCartProducts(int id) {
        Optional<Cart> byId = cartRepository.findById(id);
        if (byId.isPresent()){
            HttpEntity<String> stringHttpEntity = new HttpEntity<>("", new HttpHeaders());

            Cart cart = byId.get();

            ResponseEntity<Product[]> responseEntity = restTemplate.exchange(
                    "http://localhost:8191/services/product/getbyid/" + id, HttpMethod.GET, stringHttpEntity,
                    Product[].class);
            cart.setProducts(responseEntity.getBody());
            return cart;
        }else {
            return null;
        }
    }
}
