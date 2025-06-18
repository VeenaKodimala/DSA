package com.Basics;

import java.util.Scanner;

public class FunctionsAndMethods {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter inputs:: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = Sum(a,b);
            System.out.println("Result:: "+result);
        } catch (Exception e){
            System.out.println("Exception:: "+e);
        }
    }

    public static int Sum(int p1,int p2){
        try{
int sum = p1+p2;
return sum;

        } catch(Exception e){
return -1;
        }
    }
}
