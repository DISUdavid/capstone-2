package com.pluralsight;

import com.pluralsight.design.Design;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String input = Design.getPrompt(scanner,true,"Will I remember this?",false );
        System.out.println(input);

    }
}
