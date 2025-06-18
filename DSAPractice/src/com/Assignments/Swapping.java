package com.Assignments;

import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int[] a={3,5,4,6,65};
        swap(a,2,3);
    }

    public static void swap(int[] b,int ind1, int ind2){
int temp = b[ind1];
b[ind1] = b[ind2];
b[ind2] = temp;

        System.out.println(Arrays.toString(b));

    }
}
