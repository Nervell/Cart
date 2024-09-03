package com.shophere.cart.services;

import com.shophere.cart.model.Item;

public interface CartInterface {
    void addItem(int id);
    Item getItem();
}
