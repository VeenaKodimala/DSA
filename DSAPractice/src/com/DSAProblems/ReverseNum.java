package com.DSAProblems;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number to reverse:: ");
            int n = sc.nextInt();
            String reverse = "";
            while (n > 0) {
                int temp = n % 10;
                reverse = reverse + temp;
                n = n / 10;

            }
            System.out.println("reverse:: " + reverse);
        } catch (Exception e) {
            System.out.println("Exception:: " + e);
        }
    }
}
