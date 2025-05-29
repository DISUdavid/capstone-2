package com.pluralsight.program;

import java.util.ArrayList;

public class Order {
    private ArrayList<Drink> drinks;

    public Order(){
        drinks = new ArrayList<Drink>();
    }

    public void addDrink(Drink drink){
        drinks.add(drink);
    }



}
