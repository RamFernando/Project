package com.ramesha.ecommerce.productservice.service;

import com.ramesha.ecommerce.productservice.model.SubCategory;
import com.ramesha.ecommerce.productservice.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    SubCategoryRepository subCategoryRepository;

    @Override
    public SubCategory saveSubCategory(SubCategory subCategory) {
        return subCategoryRepository.save(subCategory);
    }
}
