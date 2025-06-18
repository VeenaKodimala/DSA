package com.DSAProblems;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter an operation to perform:: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Divide");
            System.out.println("4. Multiply");
            System.out.println("5. Exit");

            String input = sc.nextLine();

            System.out.println("Enter the inputs:: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (input) {
                case "Add", "1" -> {
                    System.out.println(a + "+" + b + " = " + (a + b));
                }
                case "Subtract", "2" -> {
                    System.out.println(a + "-" + b + " = " + (a - b));
                }
                case "Divide", "3" -> {
                    System.out.println(a + "/" + b + " = " + (a / b));
                }
                case "Multiply", "4" -> {
                    System.out.println(a + "*" + b + " = " + (a * b));
                }
                default -> {
                }
            }

            /*This is an enhanced switch where we use -> instead of :,
             multiple cases can be merged using , and here if you want fall-through(executing all
             cases w/o break, till default, then we have to go for traditional switch, this
             is a switch where break is mandatory option.

             */
        } catch (Exception e) {
            System.out.println("Exception:: " + e);
        }
    }
}
