package com.pirimid.learning.fruitvendor.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Seller {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "Seller", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FruitSeller> fruits;

    public Seller() {
    }

    public Seller(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FruitSeller> getFruits() {
        return fruits;
    }

    public void setFruits(List<FruitSeller> fruits) {
        this.fruits = fruits;
    }
}
