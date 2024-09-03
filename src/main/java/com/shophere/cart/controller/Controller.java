package com.shophere.cart.controller;

import com.shophere.cart.services.ServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/store/order")
public class Controller {

    private final ServiceImpl service;

    public Controller(ServiceImpl service) {
        this.service = service;
    }

    @GetMapping(path = "/add")
    public String addToCart(@RequestParam("ID") int id) {
        service.addItem(id);
        return "Item added to the cart!";
    }

    @GetMapping(path = "/get")
    public String getFromCart() {
        return service.getItem().toString();
    }
}
