package com.mymenu;

import java.util.ArrayList;
import java.util.List;

/**
 *  Menu class.
 */
public class Menu {

    // List to store menu items.
    List<String> menu = new ArrayList<>();

    // Adding items.
    public boolean add(String meal) {
        boolean added = false;
        if(!menu.contains(meal)) {
            menu.add(meal);
            added = true;
        }
        return added;
    }

    // Delete meal.
    public boolean delete(String meal) {
        boolean deleted = false;
        if(menu.contains(meal)) {
            menu.remove(meal);
            deleted = true;
        }
        return deleted;

    }

    // Print all meals.
    public void printAll() {
        if(menu.isEmpty()) {
            System.out.println("No items available.");
        }
        for (String meal : menu) {
            System.out.println(meal);
        }
    }

    // Deleting all dishes.
    public void deleteAll() {
        menu.clear();
    }
    
}
