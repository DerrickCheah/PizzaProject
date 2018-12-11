package pizzashop;

import pizzashop.menu.Pizza;

public class App {
    public static void main(String[] args) {
        int size = 12;
        String crust = "Thin";
        String[] toppings = {"Cheese", "Tomato Sauce"};

        Pizza cheesePizza; //Declaration of a Pizza type referenced with cheesePizza. Only in stack
        cheesePizza = new Pizza(size, crust, toppings); //Define cheesePizza as a new Pizza object. Now in heap

        Pizza pepperoniPizza = new Pizza(size, crust, "Pepperoni", "Cheese", "Tomato Sauce");

        System.out.println(cheesePizza.toString());
        System.out.println();
        System.out.println(pepperoniPizza.toString());

    }
}