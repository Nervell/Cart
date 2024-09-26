package com.shophere.cart.services;

import com.shophere.cart.model.Cart;

public interface CartInterface {
    void addItemToTheCart(Cart cart, int item);
    Cart getItemsFromTheCart(Cart cart);
    void removeItemFromTheCart(Cart cart, int item);

}
