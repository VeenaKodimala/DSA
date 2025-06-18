package com.Assignments;

public class Patterns {
    public static void main(String[] args) {
        //Pattern1(5);
        //Pattern2(5);
        //Pattern3(5);
        //Pattern4(5);
        //Pattern5(5);
        //Pattern6(5);
        //Pattern7(5);
        //Pattern8(5);
        //Pattern9 is pattern7 + pattern8
        Pattern10(5);

    }

   public static void Pattern1(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void Pattern2(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void Pattern3(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public static void Pattern4(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }

    public static void Pattern5(int n) {
        // code here
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void Pattern6(int n) {
        // code here
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public static void Pattern7(int n) {
        // Write your code here

        for(int i=0;i<n;i++){
            int columns = n%2 == 0 ? (n%2) + (i*2)+1 : (n%2) + (i*2);

            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }

            for(int j=0;j<columns;j++){
                System.out.print("*");

            }
            System.out.println("");
        }

    }

    public static void Pattern8(int n) {
        // Write your code here

        for(int i=n-1;i>=0;i--){
            int columns = n%2 == 0 ? (n%2) + (i*2)+1 : (n%2) + (i*2);

            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }

            for(int j=0;j<columns;j++){
                System.out.print("*");

            }
            System.out.println("");
        }

    }

    public static void Pattern10(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
