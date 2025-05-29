package com.pluralsight.sandwich;

import com.pluralsight.Priceable;
import com.pluralsight.Size;

import java.util.*;

import static com.pluralsight.Size.*;

public class Topping implements Priceable {
    boolean moreMeat = false;
    boolean moreCheese = false;
    //    Size steak;
//    Size ham;
//    Size salami;
//    Size roastBeef;
//    Size chicken;
//    Size bacon;
//    Size american;
//    Size provolone;
//    Size cheddar;
//    Size swiss;
//    String lettuce;
//    String peppers;
//    String onions;
//    String tomatoes;
//    String jalapenos;
//    String cucumbers;
//    String pickles;
//    String guacamole;
//    String mushrooms;
    List<Topping> meats;
    List<Topping> cheese;
    Scanner scanner = new Scanner(System.in);
    private String name;
    private Size size;

    public Topping(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public Topping() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return name + " (" + size + ")";
    }


    public void displayMeatToppings() {
        List<Topping> meats = new ArrayList<>();

        meats.add(new Topping("Steak", SMALL));
        meats.add(new Topping("Steak", MEDIUM));
        meats.add(new Topping("Steak", LARGE));
        meats.add(new Topping("Ham", SMALL));
        meats.add(new Topping("Ham", MEDIUM));
        meats.add(new Topping("Ham", LARGE));
        meats.add(new Topping("Salami", SMALL));
        meats.add(new Topping("Salami", MEDIUM));
        meats.add(new Topping("Salami", LARGE));
        meats.add(new Topping("Roast Beef", SMALL));
        meats.add(new Topping("Roast Beef", MEDIUM));
        meats.add(new Topping("Roast Beef", LARGE));
        meats.add(new Topping("Chicken", SMALL));
        meats.add(new Topping("Chicken", MEDIUM));
        meats.add(new Topping("Chicken", LARGE));
        meats.add(new Topping("Bacon", SMALL));
        meats.add(new Topping("Bacon", MEDIUM));
        meats.add(new Topping("Bacon", LARGE));

        System.out.println("Available Protein Options:");
        for (int i = 0; i < meats.size(); i++) {
            System.out.println((i + 1) + ". " + meats.get(i));
        }
        System.out.print("Please enter the number of the protein you'd like to select: ");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= meats.size()) {
            Topping selected = meats.get(choice - 1);
            System.out.println("You selected: " + selected.getName() + " (" + selected.getSize() + ")");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

//        // Set the moreMeat flag based on the response
//        moreMeat = meatResponse.equals("yes");


    }

    public void displayCheeseTopping() {
        List<Topping> cheese = new ArrayList<>();

        cheese.add(new Topping("American", SMALL));
        cheese.add(new Topping("American", MEDIUM));
        cheese.add(new Topping("American", LARGE));
        cheese.add(new Topping("Provolone", SMALL));
        cheese.add(new Topping("Provolone", MEDIUM));
        cheese.add(new Topping("Provolone", LARGE));
        cheese.add(new Topping("Cheddar", SMALL));
        cheese.add(new Topping("Cheddar", MEDIUM));
        cheese.add(new Topping("Cheddar", LARGE));
        cheese.add(new Topping("Swiss", SMALL));
        cheese.add(new Topping("Swiss", MEDIUM));
        cheese.add(new Topping("Swiss", LARGE));

        System.out.println("Available Cheese Options:");
        for (int i = 0; i < cheese.size(); i++) {
            System.out.println((i + 1) + ". " + cheese.get(i));
        }
        System.out.print("Please enter the number of the cheese you'd like to select: ");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= cheese.size()) {
            Topping selected = cheese.get(choice - 1);
            System.out.println("You selected: " + selected.getName() + " (" + selected.getSize() + ")");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }


    }

    @Override
    public double priceBySize() {
        double regularPrice = 0.0;
        double extraPrice = 0.0;
        double totalPrice = regularPrice + extraPrice;

        for (Topping meat : meats) {
            regularPrice += meat.priceBySize();

            if (moreMeat) {
                extraPrice += switch (meat.getSize()) {
                    case SMALL -> 0.50;
                    case MEDIUM -> 1.00;
                    case LARGE -> 1.50;
                };
            }
        }

        // Regular cheese pricing
        for (Topping cheeseTopping : cheese) {
            regularPrice += cheeseTopping.priceBySize();

            if (moreCheese) {
                extraPrice += switch (cheeseTopping.getSize()) {
                    case SMALL -> 0.30;
                    case MEDIUM -> 0.60;
                    case LARGE -> 0.90;
                };
            }
        }

        return totalPrice;
    }
}