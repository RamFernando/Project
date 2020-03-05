package com.ramesha.ecommerce.productservice.service;

import com.ramesha.ecommerce.productservice.model.Product;
import com.ramesha.ecommerce.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
