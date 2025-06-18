package com.DSAProblems;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:: ");
            int n = sc.nextInt();

            int a = 0;
            int b = 1;

            for (int i = 0; i < n; i++) {
                int temp = b;
                b = a + b;
                a = temp;
                System.out.println("b:: " + b);

            }

            System.out.println(n + "th Fibonacci number is:: " + b);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception:: " + e);
        }
    }

}
