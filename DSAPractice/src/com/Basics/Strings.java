package com.Basics;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            String name = new String(sc.nextLine());
            String peru = new String(sc.nextLine());

            String naam = "veena";
            String namam = "veena";

            System.out.println(name == peru);
            System.out.println(naam == namam);
            System.out.println("name == peru ::: "+name.equals(peru));
            System.out.println("naam == namam ::: "+naam.equals(namam));


        }
    }
}
