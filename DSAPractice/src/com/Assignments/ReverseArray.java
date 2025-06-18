package com.Assignments;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 6, 65};
        reverse(a);
    }

    public static void reverse(int[] b) {
        int i = 0;
        int j = b.length - 1;
        while (i < j) {
            int temp = b[i];
            b[i] = b[j];
            b[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(b));

    }
}
