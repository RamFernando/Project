package com.ramesha.ecommerce.productservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String productname;
    double price;
    double discount;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    SubCategory subCategory;

    @Fetch(FetchMode.SUBSELECT)
    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(joinColumns = { @JoinColumn(name = "product_id", referencedColumnName = "id") }, inverseJoinColumns = {
            @JoinColumn(name = "feature_id", referencedColumnName = "id") })
    List<Feature> features;

    @OneToOne(cascade = CascadeType.ALL)
    Stock stock;

    @OneToMany(targetEntity = Feedback.class,mappedBy = "product",cascade = CascadeType.ALL)
    List<Feedback> feedback;

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
