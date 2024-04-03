package com.example.demo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int productId;
    private String productCategory;
    private String productName;
    private String productBrand;
    private String manufactureId;
    private int productinStock;
    private double productPrice;
    private String productColor;
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductBrand() {
        return productBrand;
    }
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }
    public String getManufactureId() {
        return manufactureId;
    }
    public void setManufactureId(String manufactureId) {
        this.manufactureId = manufactureId;
    }
    public int getProductinStock() {
        return productinStock;
    }
    public void setProductinStock(int productinStock) {
        this.productinStock = productinStock;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductColor() {
        return productColor;
    }
    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }
    public Product(int productId, String productCategory, String productName, String productBrand, String manufactureId,
            int productinStock, double productPrice, String productColor) {
        this.productId = productId;
        this.productCategory = productCategory;
        this.productName = productName;
        this.productBrand = productBrand;
        this.manufactureId = manufactureId;
        this.productinStock = productinStock;
        this.productPrice = productPrice;
        this.productColor = productColor;
    }
    public Product() {
    }
   
    
}
