package com.shophere.cart.services;

import com.shophere.cart.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements CartInterface {

    @Override
    public void addItemToTheCart(Cart cart, int item) {
        cart.addItem(item);
    }

    @Override
    public Cart getItemsFromTheCart(Cart cart) {
        return cart;
    }

    @Override
    public void removeItemFromTheCart(Cart cart, int item) {
        cart.removeItem(item);
    }
}
