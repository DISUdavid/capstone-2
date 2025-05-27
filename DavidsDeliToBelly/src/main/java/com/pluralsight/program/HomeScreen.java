package com.pluralsight.program;

import java.util.Scanner;


public class HomeScreen {
    public void display() {
        System.out.println("Hello! Welcome to David's Deli 2 Belly!");
        System.out.println("Would you like to place an order?");
        System.out.print("0 - Exit Deli Application, 1 - Place a New Order: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        OrderScreen orderScreen = new OrderScreen();


        while (true) {
            if (userInput == 1) {
                System.out.println("You decided to eat from the Deli, now what can I get your Belly?");
                orderScreen.display();
                break;
            } else if (userInput == 0) {
                System.out.println("Is the Deli....Smelly? Sad to see you go!");
                break;
            } else {
                throw new IndexOutOfBoundsException("Error, how did you even make a new number....are you ...the One? ");

            }


        }

    }

}
