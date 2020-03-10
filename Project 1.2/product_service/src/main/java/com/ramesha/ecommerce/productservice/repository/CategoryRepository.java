package com.ramesha.ecommerce.productservice.repository;

import com.ramesha.ecommerce.productservice.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
