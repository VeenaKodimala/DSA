package com.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysandArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a; // declaration - a new reference variable is added to stack.
        a = new int[5]; // Initialization - this is where object will be created in the heap memory.

        for (int i = 0; i < a.length; i++) {
            a[i] = i * i;
        }

        System.out.println("Array a:: " + Arrays.toString(a));

        for (int num : a) {//This is a for each loop.
            System.out.println("num:: " + num);
        }

        String[][] Array2D = new String[3][3];

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[i].length; j++) {
                System.out.println("Enter Array2D[" + i + "][" + j + "]::: ");
                Array2D[i][j] = sc.nextLine();
            }
        }

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[i].length; j++) {
                System.out.println(Array2D[i][j]);
            }
            System.out.println();
        }

        for (String[] print : Array2D) {
            System.out.println(Arrays.toString(print));
        }

        //ArrayList

        ArrayList<Integer> al = new ArrayList<>(10);

        al.add(89);
        al.add(67);
        al.add(90);

        System.out.println(al);

        ArrayList<ArrayList<Integer>> Aal = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 3; i++) {
            Aal.add(new ArrayList<>());
        }
        System.out.println(Aal.size());
        System.out.println(Aal.get(0).size());
        for (int i = 0; i < Aal.size(); i++) {
            for (int j = 0; j < 3; j++) {
                Aal.get(i).add(sc.nextInt());
            }
        }

        System.out.println(Aal);

    }
}
