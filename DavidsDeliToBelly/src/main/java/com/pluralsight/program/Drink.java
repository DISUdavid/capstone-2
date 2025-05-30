package com.pluralsight.program;

import com.pluralsight.Size;

public class Drink {
    Size size;
    String flavor;

    public Drink(Size size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public double getPrice() {
        return switch (this.size) {
            case LARGE -> 3;
            case MEDIUM -> 2.5;
            case SMALL -> 2;
        };
    }
}
