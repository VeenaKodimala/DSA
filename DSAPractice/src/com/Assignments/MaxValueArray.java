package com.Assignments;

public class MaxValueArray {
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 6, 65};
        int[][]b = {{1,4,5},{8,98,0},{3,7,6}};
        max(a);
        min(a);
        arr2Dmin(b);
        arr2Dmax(b);
    }

    public static void max(int[] b) {
        int temp = b[0];
        for (int i : b) {
            if (i > temp) {
                temp = i;
            }
        }

        System.out.println("max:: " + temp);

    }

    public static void arr2Dmin(int[][] b) {
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] < temp) {
                    temp = b[i][j];

                }
            }

        }

        System.out.println("min 2d:: " + temp);

    }

    public static void arr2Dmax(int[][] b) {
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] > temp) {
                    temp = b[i][j];

                }
            }

        }

        System.out.println("max 2d:: " + temp);

    }

    public static void min(int[] b) {
        int temp = b[0];
        for (int i : b) {
            if (i < temp) {
                temp = i;
            }
        }

        System.out.println("min:: " + temp);

    }


}
