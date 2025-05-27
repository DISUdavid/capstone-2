package com.pluralsight.sandwich;

import com.pluralsight.Priceable;
import com.pluralsight.Size;

import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.Size.*;

public class Topping implements Priceable {
    Size steak;
    Size ham;
    Size salami;
    Size roastBeef;
    Size chicken;
    Size bacon;
    double american;
    double provolone;
    double cheddar;
    double swiss;
    String lettuce;
    String peppers;
    String onions;
    String tomatoes;
    String jalapenos;
    String cucumbers;
    String pickles;
    String guacamole;
    String mushrooms;
    List<Size> meats;


    public List<Size> meatbySize() {
        List<Size> meats = new ArrayList<>();
        meats.add(steak);
        meats.add(ham);
        meats.add(salami);
        meats.add(roastBeef);
        meats.add(chicken);
        meats.add(bacon);




        return this.meats ;
    }

//    @Override
//    public double priceBySize() {
//        return switch (this.meats) {
//            case SMALL -> 1.00;
//            case MEDIUM -> 2.00;
//            case LARGE -> 3.00;
//        };
//    }


}
