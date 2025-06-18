package com.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            LinearSearch ls = new LinearSearch();
            int[] arr = new int[10];
            int[][] arr2d = new int[3][3];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("arr:: "+ Arrays.toString(arr));

            for (int i = 0; i < arr2d.length; i++) {
                for(int j=0;j<arr2d[i].length;j++){
                    arr2d[i][j] = sc.nextInt();
                }
            }

            for(int[] print : arr2d){
                System.out.println(Arrays.toString(print));
            }



            System.out.println("Enter the key to find::");
            int key = sc.nextInt();

            int index = ls.linearsearch(arr,key);
            if(index > 0){
                System.out.println(key + " is found at:: "+index);
            } else{
                System.out.println(key+" is not found");
            }

            String result2darr = ls.search2DArray(arr2d,key);
            System.out.println(key+" is found in:: "+result2darr);


        } catch (Exception e) {
            System.out.println("Exception:: " + e);
        }


    }

    public int linearsearch(int[] arr, int key) {
        try {
            System.out.println("arr:: "+ Arrays.toString(arr)+" key:: "+key);
            if (arr.length > 0) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == key) {
                        return i;
                    }
                }
            } else {
                return -1;
            }
            return -1;
        } catch (Exception e) {
            System.out.println("Exception:: " + e);
            return -1;
        }
        // return 0;
    }

    public String search2DArray(int[][] arr2d,int key){
        try{
            if(arr2d.length != 0) {
                for (int i = 0; i < arr2d.length; i++) {
                    for (int j = 0; j < arr2d[i].length; j++) {
                        if (arr2d[i][j] == key) {
                            return "Row:: " + i + " Column:: " + j;
                        }

                    }

                }
            } else{
                return "Not found";
            }

        }catch(Exception e){
return "error";
        }
        return "Not found";
    }
}
