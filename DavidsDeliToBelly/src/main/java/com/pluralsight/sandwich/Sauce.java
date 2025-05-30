package com.pluralsight.sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sauce {
    String mayo = "mayo";
    String mustard = "mustard";
    String ketchup = "ketchup";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String goldenBBQ = "goldenBBQ";
    String blueCheese = "blue cheese";
    String ranch = "ranch";
    String thousandIsland = "thousand island";
    String vinaigrette = "vinaigrette";
    List<Sauce> sauces;
    Scanner scanner = new Scanner(System.in);
    String name;

    public Sauce(String name ){
        this.name = name;
    }

    public void displaySauces(){
        sauces = new ArrayList<>();

        sauces.add(new Sauce(mayo));
        sauces.add(new Sauce(mustard));
        sauces.add(new Sauce(ketchup));
        sauces.add(new Sauce(goldenBBQ));
        sauces.add(new Sauce(blueCheese));
        sauces.add(new Sauce(ranch));
        sauces.add(new Sauce(thousandIsland));
        sauces.add(new Sauce(vinaigrette));


        System.out.println("Available Regular Toppings Options:");
        for (int i = 0; i < sauces.size(); i++) {
            System.out.println((i + 1) + ". " + sauces.get(i));
        }
        System.out.print("Please enter the number of the other topping you'd like to select: ");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= sauces.size()) {
            Sauce selected = sauces.get(choice - 1);
            System.out.println("You selected: " + selected.getName());
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

    }
}



