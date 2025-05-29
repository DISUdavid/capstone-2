package com.pluralsight.sandwich;

import com.pluralsight.Priceable;
import com.pluralsight.Size;

import java.util.List;
import java.util.Scanner;

public class Sandwich implements Priceable {
    Bread bread;
    List<Topping> toppings;
    Size sandwichSize;
    List<Sauce> sauces;
    boolean toasted;
    double price;
    Scanner scanner = new Scanner(System.in);
//    Sandwich sandwich = new Sandwich();

    public Sandwich() {
    }

    public Sandwich(Bread bread, List<Topping> toppings, Size sandwichSize) {
        this.bread = bread;
        this.toppings = toppings;
        this.sandwichSize = sandwichSize;
        this.price = 0;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public Size getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(Size sandwichSize) {
        this.sandwichSize = sandwichSize;
        switch (sandwichSize) {
            case SMALL:
                System.out.println("You have selected SMALL");
                break;
            case MEDIUM:
                System.out.println("You have selected MEDIUM");
                break;
            case LARGE:
                System.out.println("You have selected LARGE");
                break;
            default:
                System.out.println("Invalid input");

        }
    }

    public double priceBySize() {
        return switch (this.sandwichSize) {
            case LARGE -> 8.50;
            case MEDIUM -> 7.00;
            case SMALL -> 5.50;
        };
    }

    public void setBreadType(int userInput) {
        switch (userInput) {
            case 1:
                setBread(Bread.RYE);
                break;
            case 2:
                setBread(Bread.WHEAT);
                break;
            case 3:
                setBread(Bread.WHITE);
                break;
            case 4:
                setBread(Bread.WRAP);
                break;
            default:
                System.out.println("invalid input");
                // send them back to the main menu
        }

//        return switch (this.bread){
//            case RYE, WHEAT, WRAP, WHITE -> priceBySize();
//        };
    }


    public void addSandwich() {
        Sandwich sandwich = new Sandwich(bread, toppings, sandwichSize);
        Topping topping = new Topping();

        System.out.println("Choose a size: SMALL, MEDIUM, LARGE");
           String input = scanner.nextLine();
//        sandwich.setSandwichSize(Size.valueOf(input));
        try {
            // Convert input to uppercase and assign to sandwichSize
            this.sandwichSize = Size.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid size entered. Defaulting to MEDIUM.");
            this.sandwichSize = Size.MEDIUM; // Assign default value
        }

        //Ask user what size do they want
        //Set sandwich size to user selection

        //Display bread options - int 1,2,3,4
        System.out.println("What bread would you like? ");
        System.out.println("1 - RYE");
        System.out.println("2 - WHEAT");
        System.out.println("3 - WHITE");
        System.out.println("4 - WRAP");
        int userInput = Integer.parseInt(scanner.nextLine());
        sandwich.setBreadType(userInput);
        topping.priceBySize();

        // ask user for meat choices
        System.out.println("What kind of protein would you like?: ");
        topping.displayMeatToppings();

        // extra?
        System.out.print("Would you like extra meat? (yes/no): ");
        String meatResponse = scanner.nextLine().trim().toLowerCase();


        // ask user for cheese choices
        System.out.println("How about cheeses?: ");
        topping.displayCheeseTopping();
        // extra?
        System.out.print("Would you like extra meat? (yes/no): ");
        String cheeseResponse = scanner.nextLine().trim().toLowerCase();

        // ask user for toppings

        // ask user for sauces

        // ask user for sides

        // do they want the sandwich toasted? yes/no

        // return sandwich


    }


}
