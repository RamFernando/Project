package com.ramesha.ecommerce.productservice.controller;

import com.ramesha.ecommerce.productservice.model.Category;
import com.ramesha.ecommerce.productservice.service.CategoryService;
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
        return categoryService.saveCategory(category);
    }
}
