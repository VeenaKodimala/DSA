package com.Basics;

import java.util.Scanner;

public class ConditionsNdLoops {

    Scanner sc = new Scanner(System.in);

    public void ConditionStmts() {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            if (a > 10) {
                System.out.println(a + " is greater than 10");
            } else {
                System.out.println(a + " is less than 10");
            }

            char z = sc.next().charAt(2);
            if (z >= 'a' && z <= 'z') {
                System.out.println(z + " is in btw a and z");
            }
        } catch (Exception e) {
            System.out.println("Error:: " + e);
        }
    }

    public void Loops() {
        try {
            System.out.println("Before a for loop....");
            for (int i = 0; i < 5; i++) {
                System.out.println("i::: " + i);
                System.out.println(i + " * " + i + " = " + i * i);
            }

            int t = 5;
            while (t < 20) {
                System.out.println("t at start::: " + t);
                t = t * 1;
                t = t + 3;
                System.out.println("t at end::: " + t);
            }

            int dovar = sc.nextInt();
            do {
                dovar = dovar + 2;
                System.out.println("dovar:: " + dovar);
            } while (dovar < 5);
        } catch (Exception e) {
            System.out.println("Error:: " + e);
        }

    }

    public void NestedConditions() {
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x > y) {
                if (x > z) {
                    System.out.println(x + " is the largest number");
                } else {
                    System.out.println(z + " is the largest number");
                }
            } else {
                if (y > z) {
                    System.out.println(y + " is the largest number");
                } else {
                    System.out.println(z + " is the largest number");
                }
            }
        } catch (Exception e) {
            System.out.println("Error:: " + e);
        }
    }

    public void ternaryOperations() {
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int result = x > y ? x > z ? x : z : y > z ? y : z;
            System.out.println(result + " is the largest number");
        } catch (Exception e) {
            System.out.println("Error:: " + e);
        }

    }

}
