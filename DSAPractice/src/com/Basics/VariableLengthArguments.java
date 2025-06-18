package com.Basics;

import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args) {
        try{
            VariableLengthArguments v = new VariableLengthArguments();
            v.ArrStrings("veena","job","salary","taurus");
            v.ArrInts(4,5,6,3,6,0);
            v.MixedParams(9,3,"hello",0,6,8,7,4,6);
            v.ArrInts();
        } catch(Exception e){
            System.out.println("Exception:: "+e);
        }
    }

    public void ArrStrings(String ...s){
        System.out.println("s[0]:: "+s[0]);
        System.out.println("s:: "+ Arrays.toString(s));

    }

    public void ArrInts(int ...i){
        System.out.println("i:: "+ Arrays.toString(i));

    }

    public void MixedParams(int g,int h,String v,int ...i){
        System.out.println("g:: "+g);
        System.out.println("h:: "+ h);
        System.out.println("v:: "+ v);
        System.out.println("i:: "+ Arrays.toString(i));

    }
}
