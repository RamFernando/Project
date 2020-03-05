package com.ramesha.ecommerce.productservice.repository;

import com.ramesha.ecommerce.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
