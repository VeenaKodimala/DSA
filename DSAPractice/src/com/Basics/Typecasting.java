package com.Basics;

public class Typecasting {
    public void TypeCasting() {
        int i = 345;
        byte b = (byte) i;
        System.out.println("b::: " + b);
        System.out.println();
        // byte a = 2;
        // byte c = 98;

        // Type promotion rules
        int x = 89;
        double y = 899.787;
        long f = 789789;
        float v = 56.89f;
        char g = 'h';
        short d = 8907;

        double result = (x * f) / (g + v) * (d - y);

        System.out.println((x * f) + " " + (f + v) + " " + (d - y));
        System.out.println("result:: " + result);
    }
}
