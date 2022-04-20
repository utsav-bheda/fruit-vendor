package com.pirimid.learning.fruitvendor.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class FruitSeller {
    @EmbeddedId
    private FruitSellerId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("fruitId")
    private Fruit fruit;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("sellerId")
    private Seller seller;

    @Column
    private Double price;

    @Column
    private Long quantity;

    public FruitSeller(){
    }

    public FruitSeller(Fruit fruit, Seller seller, Double price, Long quantity) {
        this.fruit = fruit;
        this.seller = seller;
        this.price = price;
        this.quantity = quantity;
        this.id = new FruitSellerId(fruit.getId(), seller.getId());
    }

    public FruitSellerId getId() {
        return id;
    }

    public void setId(FruitSellerId id) {
        this.id = id;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FruitSeller that = (FruitSeller) o;
        return Objects.equals(id, that.id) && Objects.equals(fruit, that.fruit) && Objects.equals(seller, that.seller) && Objects.equals(price, that.price) && Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fruit, seller, price, quantity);
    }
}
