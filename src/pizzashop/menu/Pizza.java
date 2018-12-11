package pizzashop.menu;

import java.util.Arrays;

public class Pizza {
    int size;
    String crust;
    String[] toppings;

    /*
    access modifiers: public, (default), protected, private
    private: only accessible within the class
    (default): only accessible within the package
    protected: only accessible within the package and subclasses outside the package
    public: accessible everywhere
    */

    public Pizza(int size, String crust, String ...toppings) {
        this.size = size;
        this.crust = crust + " Pizza";
        Arrays.sort(toppings);
        this.toppings = toppings;
    }

    public Pizza() {       
    }

    public String toString() {
        return "Pizza Size: " + size 
            + "\nPizza Crust: " + crust
            + "\nPizza Toppings: " + Arrays.toString(toppings);
    }
}