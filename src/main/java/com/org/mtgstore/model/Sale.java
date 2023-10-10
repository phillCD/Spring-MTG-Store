package com.org.mtgstore.model;

import com.org.mtgstore.enums.PaymentOpt;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sale extends EntityId{
    @Column(name = "date_purchase")
    private LocalDateTime datePurchase;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @Enumerated(EnumType.STRING)
    @Column(name = "payment_opt")
    private PaymentOpt paymentOpt;
    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private List<ItemSale> items = new ArrayList<>();

    public Sale() {
    }

    public LocalDateTime getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(LocalDateTime datePurchase) {
        this.datePurchase = datePurchase;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public PaymentOpt getPaymentOpt() {
        return paymentOpt;
    }

    public void addItemSale(ItemSale item){
        item.setSale(this);
        this.items.add(item);
    }

    public void delItemSale(ItemSale item){
        this.items.remove(item);
    }

    public List<ItemSale> getItems() {
        return items;
    }

    public void setItems(List<ItemSale> items) {
        this.items = items;
    }
}
