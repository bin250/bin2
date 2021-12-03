package com.offcn.bean;

public class Product {
    private Long productId;

    private String productName;

    private Integer productSale;

    private Double productPrice;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getProductSale() {
        return productSale;
    }

    public void setProductSale(Integer productSale) {
        this.productSale = productSale;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
}