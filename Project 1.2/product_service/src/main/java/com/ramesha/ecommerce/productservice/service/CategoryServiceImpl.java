package com.ramesha.ecommerce.productservice.service;

import com.ramesha.ecommerce.productservice.model.Category;
import com.ramesha.ecommerce.productservice.model.SubCategory;
import com.ramesha.ecommerce.productservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        for (SubCategory subCategory : category.getSubCategories()){
            subCategory.setCategory(category);
        }
        return categoryRepository.save(category);
    }
}
