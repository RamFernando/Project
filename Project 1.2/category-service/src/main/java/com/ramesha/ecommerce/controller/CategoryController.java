package com.ramesha.ecommerce.controller;

import com.ramesha.ecommerce.model.Category;
import com.ramesha.ecommerce.model.SubCategory;
import com.ramesha.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/testCat")
    public String test(){
        return "Hello Category";
    }

    @RequestMapping("/category/save")
    public Category saveCategory(@RequestBody Category category){
        for (SubCategory subCategory : category.getSubCategories()){
            subCategory.setCategory(category);
        }
        return categoryService.addCategory(category);
    }

}
