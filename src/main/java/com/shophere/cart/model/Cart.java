package com.shophere.cart.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;


@Component
@SessionScope
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
