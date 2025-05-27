package com.pluralsight.sandwich;

import com.pluralsight.Priceable;
import com.pluralsight.Size;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Priceable {
    Bread bread;
    List<Topping> toppings;
    Size sandwhichSize;
    List<Sauce> sauces;
    boolean toasted;
    double price;

    public Sandwich() {
    }

    public Sandwich(Bread bread, List<Topping> toppings, Size sandwhichSize) {
        this.bread = bread;
        this.toppings = toppings;
        this.sandwhichSize = sandwhichSize;
        this.price = 0;
    }

    public double priceBySize() {
        return switch (this.sandwhichSize) {
            case LARGE -> 8.50;
            case MEDIUM -> 7.00;
            case SMALL -> 5.50;
        };
    }

    public double breadSize(){
        return switch (this.bread){
            case RYE, WHEAT, WRAP, WHITE -> priceBySize();
        };
    }

    Sandwich sandwich;
    Topping topping;


    public void addSandwich() {
       sandwich.breadSize() ;


    }


}
