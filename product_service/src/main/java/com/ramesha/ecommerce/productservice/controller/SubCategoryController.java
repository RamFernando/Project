package com.ramesha.ecommerce.productservice.controller;

import com.ramesha.ecommerce.productservice.model.SubCategory;
import com.ramesha.ecommerce.productservice.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class SubCategoryController {

    @Autowired
    SubCategoryService subCategoryService;

    @RequestMapping("/testSub")
    public String test(){
        return "Hello Subcategory";
    }

    @RequestMapping("/subcategory/save")
    public SubCategory saveSubCategory(@RequestBody SubCategory subCategory){
        return subCategoryService.saveSubCategory(subCategory);
    }
}
