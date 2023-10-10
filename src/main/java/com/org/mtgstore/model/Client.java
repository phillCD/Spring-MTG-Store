package com.org.mtgstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Client extends User {
    @Column(name = "cpf")
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
