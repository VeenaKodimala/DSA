package com.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class EvenDigitsArr {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5];
            System.out.println("Enter the array of numbers::");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("arr:: " + Arrays.toString(arr));

            EvenDigitsArr ev = new EvenDigitsArr();

            int count = ev.EvenDigitNum(arr);
            System.out.println("count:: "+count);

        } catch (Exception e) {

        }
    }


    public int EvenDigitNum(int[] ip) {
        try {
            int count = 0;
            if (ip.length > 0) {
                for (int i = 0; i < ip.length; i++) {
                    int temp = ip[i];
                    int digitcount = 0;
                    while (temp > 0) {
                        digitcount++;
                        temp = temp / 10;
                    }
                    System.out.println("digitcount:: " + digitcount);
                    if (digitcount % 2 == 0) {
                        count++;
                    }
                }
                return count;
            } else {
                return -1;
            }

        } catch (Exception e) {
            return -1;
        }
    }
}
