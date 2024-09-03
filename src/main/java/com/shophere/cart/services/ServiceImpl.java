package com.shophere.cart.services;

import com.shophere.cart.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements CartInterface {

    @Autowired
    private final Item item;

    public ServiceImpl(Item item) {
        this.item = item;
    }

    @Override
    public void addItem(int id) {
        item.setId(id);
    }

    @Override
    public Item getItem() {
        return item;
    }
}
