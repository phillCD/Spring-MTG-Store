package com.org.mtgstore.model;

import com.org.mtgstore.enums.ProductType;
import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_product")
public abstract class Product extends EntityId{
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_type")
    private ProductType typeProduct;
    @Column(name = "unitary_price")
    private Double unitaryValue;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_store")
    private Store store;

    public Product() {
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(ProductType typeProduct) {
        this.typeProduct = typeProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitaryValue() {
        return unitaryValue;
    }

    public void setUnitaryValue(Double unitaryValue) {
        this.unitaryValue = unitaryValue;
    }
}
