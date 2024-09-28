package com.shophere.cart.services;

import com.shophere.cart.model.Cart;

public interface CartInterface {
    void addItemToTheCart(int item);
    Cart getItemsFromTheCart();
    void removeItemFromTheCart(int item);

}
