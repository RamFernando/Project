package com.ramesha.ecommerce.cartservice.commonmodel;

public class Product {

    int id;
    String productname;
    double price;
    double discount;
    Product [] allocation;

    public Product[] getAllocation() {
        return allocation;
    }

    public void setAllocation(Product[] allocation) {
        this.allocation = allocation;
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
