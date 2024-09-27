package com.shophere.cart.services;

import com.shophere.cart.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements CartInterface {
    private final Cart cart;
    public ServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItemToTheCart(int item) {
        cart.addItem(item);
    }

    @Override
    public Cart getItemsFromTheCart() {
        return cart;
    }

    @Override
    public void removeItemFromTheCart(int item) {
        cart.removeItem(item);
    }
}
