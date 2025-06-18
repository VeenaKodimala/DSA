package com.Basics;

public class Shadowing extends ShadowingParent{
    static int a = 12;
    public static void main(String[] args) {
    Shadowing s = new Shadowing();

        System.out.println("a b4 calling ShadowShowcase::: "+a);
        System.out.println("a after upcasting child object::: "+((ShadowingParent)s).a);
    s.ShadowShowcase();
        System.out.println("a after calling ShadowShowcase::: "+a);
        System.out.println("a after upcasting child object an after calling ShadowShowcase" +
                "method::: "+((ShadowingParent)s).a);
    }


    public void ShadowShowcase(){
        int a;
        a=89;
        System.out.println("a::: "+a);//showing global variable a.

    }


}


