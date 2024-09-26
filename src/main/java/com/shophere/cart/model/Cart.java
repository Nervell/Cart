package com.shophere.cart.model;

import java.util.ArrayList;
import java.util.List;



public class Cart {
    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> getItems() {
        return items;
    }

    public void addItem(int item) {
        this.items.add(item);
    }

    public void removeItem(int item) {
        this.items.remove(item);
    }
}
