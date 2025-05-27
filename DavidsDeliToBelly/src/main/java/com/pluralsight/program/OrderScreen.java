package com.pluralsight.program;

import com.pluralsight.OtherProducts;
import com.pluralsight.sandwich.Sandwich;

import java.util.Scanner;

public class OrderScreen {
    public void display(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("1 - Add Sandwich");
            System.out.println("2 - Add Drink");
            System.out.println("3 - Add Chips");
            System.out.println("4 - Checkout");
            System.out.println("0 - Cancel Order"); // head back to home page

            System.out.print("Choose an option: ");
            int userInput = scanner.nextInt();
            scanner.nextLine(); // consume newline
            HomeScreen homeScreen = new HomeScreen();
            Sandwich sandwich = new Sandwich();
            OtherProducts otherProducts = new OtherProducts();


            switch (userInput) {
                case 1:
                    System.out.println("You selected: Add Sandwich");
                     sandwich.addSandwich();
                    break;
                case 2:
                    String drinkInput = scanner.nextLine();
                    System.out.println("You selected: Add Drink" + " its a " + drinkInput + " right?");
                    System.out.println("Awesome! What size?: ");
                     otherProducts.priceBySize();
                    break;
                case 3:
                    String chipInput = scanner.nextLine();
                    System.out.println("You selected: Add Chips");
                    System.out.println("What kind of chips?: " + chipInput);
                    System.out.println("That's actually one of my favorite's! I got you!");
                    otherProducts.addChips();
                    break;
                case 4:
                    System.out.println("Checking out... check you out!");
                    // call checkout();
                    running = false;  // exit loop
                    break;
                case 0:
                    System.out.println("You don't want anything? I promise you the cat wasn't sleeping on the bread!");
                    running = false;// exit loop
                    System.out.println();
                    homeScreen.display();
                    break;
                default:
                    System.out.println("Sorry, David can only count to 4. Ain't it Fantastic!?");
                    System.out.println();
            }
        }

    }
}
