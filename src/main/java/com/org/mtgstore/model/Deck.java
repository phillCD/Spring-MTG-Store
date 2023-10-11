package com.org.mtgstore.model;

import com.org.mtgstore.enums.DeckType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("deck")
public class Deck extends Product{
    @Column(name = "deck_size")
    private Double deckSize;
    @Column(name = "deck_color")
    private String deckColor;
    @Enumerated(EnumType.STRING)
    @Column(name = "deck_type")
    private DeckType deckType;
    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    private List<Card> cards = new ArrayList<>();


    public Deck() {
    }

    public Double getDeckSize() {
        return deckSize;
    }

    public void setDeckSize(Double deckSize) {
        this.deckSize = deckSize;
    }

    public String getDeckColor() {
        return deckColor;
    }

    public void setDeckColor(String deckColor) {
        this.deckColor = deckColor;
    }

    public DeckType getDeckType() {
        return deckType;
    }

    public void setDeckType(DeckType deckType) {
        this.deckType = deckType;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Product card){
        card.setCard((Card) card);
        this.cards.add((Card) card);
    }

    public void delCard(Product card){
        this.cards.remove(card);
    }
}
