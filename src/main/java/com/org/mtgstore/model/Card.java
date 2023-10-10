package com.org.mtgstore.model;

import com.org.mtgstore.enums.CardType;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("card")
public class Card extends Product{
    @Column(name = "effect")
    private String effect;
    @Column(name = "rarity")
    private String rarity;
    @Column(name = "set_number")
    private Integer setNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "card_type")
    private CardType cardType;
    @Column(name = "casting_cost")
    private String castingCost;
    @Column(name = "artist")
    private String artist;

    public Card() {
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Integer getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(Integer setNumber) {
        this.setNumber = setNumber;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getCastingCost() {
        return castingCost;
    }

    public void setCastingCost(String castingCost) {
        this.castingCost = castingCost;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        artist = artist;
    }
}
