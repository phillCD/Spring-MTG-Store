package com.org.mtgstore.model;

import jakarta.persistence.*;

@Entity
public class ItemSale extends EntityId{
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "discount")
    private Double discount;
    @Column(name = "unitary_value")
    private Double unitaryValue;
    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;

    public ItemSale() {
    }

    public ItemSale(Product product, Double quantity, Double discount, Sale sale, Double unitaryValue) {
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
        this.sale = sale;
        this.unitaryValue = unitaryValue;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale purchase) {
        this.sale = sale;
    }

    public Double getUnitaryValue() {
        return unitaryValue;
    }

    public void setUnitaryValue(Double unitaryValue) {
        this.unitaryValue = unitaryValue;
    }

    public Double getTotalValue(){
        double totalValue = this.getUnitaryValue()* this.getQuantity();
        double discountValue = totalValue * (this.getDiscount()/100);
        return totalValue - discountValue;
    }
}
