package com.pirimid.learning.fruitvendor.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Fruit {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    private FruitType fruitType;

    @OneToMany(mappedBy = "Fruit", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FruitSeller> sellers = new ArrayList<>();

    public Fruit() {
    }

    public Fruit(FruitType fruitType) {
        this.fruitType = fruitType;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public void setFruitType(FruitType fruitType) {
        this.fruitType = fruitType;
    }

    public List<FruitSeller> getSellers() {
        return sellers;
    }

    public void setSellers(List<FruitSeller> sellers) {
        this.sellers = sellers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(id, fruit.id) && fruitType == fruit.fruitType && Objects.equals(sellers, fruit.sellers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fruitType, sellers);
    }
}
