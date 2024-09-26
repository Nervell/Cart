package com.shophere.cart.controller;

import com.shophere.cart.model.Cart;
import com.shophere.cart.services.CartInterface;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/store/order")
public class Controller {

    private final CartInterface service;

    public Controller(CartInterface service) {
        this.service = service;
    }

    private Cart getCartFromSession(HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        return cart;
    }

    @GetMapping(path = "/add")
    public String addToCart(@RequestParam(name = "ID") int item, HttpSession session) {
        Cart cart = getCartFromSession(session);
        service.addItemToTheCart(cart, item);
        return "Item added to the cart!";
    }

    @GetMapping(path = "/get")
    public Cart getFromCart(HttpSession session) {
        return getCartFromSession(session);
    }

    @GetMapping(path = "/remove")
    public String removeFromCart(@RequestParam("ID") int item, HttpSession session) {
        Cart cart = getCartFromSession(session);
        service.removeItemFromTheCart(cart, item);
        return "Item deleted from the cart!";
    }
}
