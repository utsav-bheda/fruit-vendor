package com.pirimid.learning.fruitvendor.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class FruitTransaction {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    private TransactionType type;
    @ManyToOne
    private FruitSeller fruitSeller;
    @Column
    private Double price;
    @Column
    private Long quantity;

    public FruitTransaction() {
    }

    public FruitTransaction(TransactionType type, FruitSeller fruitSeller, Double price, Long quantity) {
        this.type = type;
        this.fruitSeller = fruitSeller;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public FruitSeller getFruitSeller() {
        return fruitSeller;
    }

    public void setFruitSeller(FruitSeller fruitSeller) {
        this.fruitSeller = fruitSeller;
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
        FruitTransaction that = (FruitTransaction) o;
        return Objects.equals(id, that.id) && type == that.type && Objects.equals(fruitSeller, that.fruitSeller) && Objects.equals(price, that.price) && Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, fruitSeller, price, quantity);
    }
}
