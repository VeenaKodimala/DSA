package com.DSAProblems;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int u=90;
            int y = 89;

            int temp=u;
            u=y;
            y=temp;

            System.out.println("u:: "+u);
            System.out.println("y:: "+y);

        } catch (Exception e){
            System.out.println("Exception:: "+e);
        }
    }
}
