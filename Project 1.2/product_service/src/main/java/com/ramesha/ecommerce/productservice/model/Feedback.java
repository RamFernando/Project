package com.ramesha.ecommerce.productservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int rate;
    String feedabck;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getFeedabck() {
        return feedabck;
    }

    public void setFeedabck(String feedabck) {
        this.feedabck = feedabck;
    }
}
