package com.ramesha.ecommerce.productservice.service;

import com.ramesha.ecommerce.productservice.model.Product;
import com.ramesha.ecommerce.productservice.repository.ProductRepository;
import org.springframework.data.domain.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

//    @Override
//    public List<Product> getProductById(int id) {
//
//        Product newProduct = new Product();
//        newProduct.setId(id);
//
//        Example<Product> example = Example.of(newProduct);
//
//        List<Product> all = productRepository.findAll(example);
//
//        return all;
//    }
}
