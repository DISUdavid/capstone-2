package com.pluralsight;

import java.util.Scanner;

import static com.pluralsight.Size.*;

public class OtherProducts implements Priceable {
    double chips;
    Scanner scanner;
    Size drink;

    public OtherProducts(Size drink) {
        this.drink = drink;
    }


    public OtherProducts(double chips) {
        this.chips = chips;
    }

    public OtherProducts(double chips, Size drink) {
        this.chips = chips;
        this.drink = drink;
    }

    public OtherProducts() {
    }

    public double addChips() {

        return 1.50;
    }


    public double priceBySize() {
        return switch (this.drink) {
            case SMALL -> 2.00;
            case MEDIUM -> 2.50;
            case LARGE -> 3.00;
        };
    }
}
