package com.pluralsight.design;

import java.util.Scanner;

public class Design {
    static Scanner scanner = new Scanner(System.in);

    public static void visualLineTop() {
        System.out.println("\n\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31");
    }

    public static void visualLineBottom() {
        System.out.println("\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31\uD83D\uDD31");
    }

    public static boolean isEmpty(String input) {
        return input.isEmpty();
    }

    public static void notEmpty() {
        System.out.println("This field can not be empty.");
    }

    public static void startPrompt() {
        System.out.print("Enter:  ");
    }

    public static String autoCapitalize(String string) {
        String[] parts = string.toLowerCase().split(" ");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
        }
        return String.join(" ", parts);
    }

    public static String getPrompt(Scanner scanner, boolean areYouActive, String prompt, boolean areYouAutoCapped) {
        String userInput = null;
        boolean keepGoing = true;
        while (keepGoing) {
            if (areYouActive) {
                Design.visualLineTop();
                System.out.println(prompt + "\n");
                Design.visualLineBottom();
            }
            startPrompt();
            userInput = scanner.nextLine().trim().replaceAll("\\s+", " ");
            if (isEmpty(userInput)) {Design.notEmpty();continue;}
            if (areYouAutoCapped) {userInput = Design.autoCapitalize(userInput);}
            keepGoing = false;
        }
        return userInput;
    }

}
