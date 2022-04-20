package com.pirimid.learning.fruitvendor.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FruitSellerId implements Serializable {
    @Column
    private Long fruitId;
    @Column
    private Long sellerId;

    public FruitSellerId() {
    }

    public FruitSellerId(Long fruitId, Long sellerId) {
        this.fruitId = fruitId;
        this.sellerId = sellerId;
    }

    public Long getFruitId() {
        return fruitId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FruitSellerId)) return false;
        FruitSellerId that = (FruitSellerId) o;
        return Objects.equals(getFruitId(), that.getFruitId()) && Objects.equals(getSellerId(), that.getSellerId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFruitId(), getSellerId());
    }
}
