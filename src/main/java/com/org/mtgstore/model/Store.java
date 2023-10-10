package com.org.mtgstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Store extends User{
    @Column(name = "cnpj")
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
