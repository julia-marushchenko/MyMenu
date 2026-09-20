/**
 *  Java program to store items of menu.
 */

package com.mymenu;

/**
 *  Menu class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating Menu instance.
        Menu menu = new Menu();

        // Adding dishes.
        menu.add("Pasta");
        menu.add("Pizza");
        menu.add("Lasagna");
        menu.add("Risotto");
        menu.add("Spaghetti");

        // Printing menu.
        System.out.println("==Menu==");
        menu.printAll();

        // Delete dish.
        menu.delete("Risotto");

        // Printing menu.
        System.out.println("==Menu==");
        menu.printAll();

        // Deleting all items.
        menu.deleteAll();

        // Printing menu.
        System.out.println("==Menu==");
        menu.printAll();
    }
}