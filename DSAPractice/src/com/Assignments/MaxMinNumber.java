package com.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter three number to find "
                    + "the maximum and minimum number:");
            int[] num = new int[3];

            for (int i = 0; i < 3; i++) {
                //System.out.println("i:: "+i);
                System.out.println("Enter number " + i + ":: ");
                if (sc.hasNextInt()) {//First checks if the user enter number(integer).
                    num[i] = sc.nextInt();//if so, it will accept the input
                } else {
                    System.out.println("Please enter a valid number..");
                    sc.nextLine();//It will take the wrong input entered by user,
                    // so that next nextInt works fine. 
                    i--;//decrements i, to repeat the same case, since user entered wrong input

                }
            }
            System.out.println("Provided input:: " + Arrays.toString(num));
            int maxNum = MaxNum(num);
            int minNum = MinNum(num);
            System.out.println("The maximum number is:: " + (maxNum == -999 ? "Error occured" : maxNum));
            System.out.println("The minimum number is:: " + (minNum == -999 ? "Error occured" : minNum));
        } catch (Exception e) {
            System.out.println("Exception:: " + e);
        }
    }

    public static int MaxNum(int... n) {
        try {
            if (n[0] > n[1]) {
                return Math.max(n[0], n[2]);
            } else {
                return Math.max(n[1], n[2]);
            }
        } catch (Exception e) {
            System.out.println("Exception occured:: " + e);
            return -999;
        }
    }

    public static int MinNum(int... n) {
        try {
            if (n[0] < n[1]) {
                return Math.min(n[0],n[2]);
            } else {
                return Math.min(n[1],n[2]);
            }
        } catch (Exception e) {
            System.out.println("Exception occured:: " + e);
            return -999;
        }
    }
}
