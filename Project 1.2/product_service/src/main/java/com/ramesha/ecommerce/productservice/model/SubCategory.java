package com.ramesha.ecommerce.productservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SubCategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String subcategory;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Category category;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = Product.class, mappedBy = "subCategory")
    List<Product> products;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
}
