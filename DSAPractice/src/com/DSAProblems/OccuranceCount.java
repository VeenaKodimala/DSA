package com.DSAProblems;

import java.util.Scanner;

public class OccuranceCount {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:: ");
            int n = sc.nextInt();
            System.out.println("Enter the number to find the occurrences:: ");
            int k = sc.nextInt();
            int count = 0;

            while (n > 0) {
                int temp = n % 10;
                if (temp == k) {
                    count = count + 1;
                }
                n = n / 10;
                System.out.println("count:: " + count);
                System.out.println("n:: " + n);
            }
            System.out.println("count:: " + count);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
