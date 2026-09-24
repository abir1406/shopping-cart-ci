package com.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000);

        assertEquals(50000, cart.calculateTotal());
    }

    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000);
        cart.addItem("Mouse", 1000);

        cart.removeItem("Mouse");

        assertEquals(50000, cart.calculateTotal());
    }

    @Test
    public void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000);
        cart.addItem("Mouse", 1000);
        cart.addItem("Keyboard", 2000);

        assertEquals(53000, cart.calculateTotal());
    }
}
