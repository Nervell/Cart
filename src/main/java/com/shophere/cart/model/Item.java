package com.shophere.cart.model;

import org.springframework.stereotype.Component;

@Component
public class Item {
    private int id;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
