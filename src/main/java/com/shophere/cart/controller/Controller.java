package com.shophere.cart.controller;

import com.shophere.cart.model.Cart;
import com.shophere.cart.services.CartInterface;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/store/order")
public class Controller {

    private final CartInterface service;

    public Controller(CartInterface service) {
        this.service = service;
    }


    @GetMapping(path = "/add")
    public String addToCart(@RequestParam(name = "ID") int item) {
        service.addItemToTheCart(item);
        return "Item added to the cart!";
    }

    @GetMapping(path = "/get")
    public List<Integer> getFromCart() {
        return service.getItemsFromTheCart().getItems();
    }

    @GetMapping(path = "/remove")
    public String removeFromCart(@RequestParam("ID") int item) {
        service.removeItemFromTheCart(item);
        return "Item deleted from the cart!";
    }
}
