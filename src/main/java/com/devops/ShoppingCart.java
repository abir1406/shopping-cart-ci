package com.devops;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Double> items = new HashMap<>();

    // Add an item to the shopping cart
    public void addItem(String itemName, double price) {
        items.put(itemName, price);
    }

    // Remove an item from the shopping cart
    public void removeItem(String itemName) {
        items.remove(itemName);
    }

    // Calculate total price of all items
    public double calculateTotal() {
        double total = 0;

        for (double price : items.values()) {
            total += price;
        }

        return total;
    }
}
