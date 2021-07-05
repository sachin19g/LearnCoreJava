package com.error.personal;

import java.util.Scanner;

public class PersonalRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter name");
        String name = scanner.nextLine ();
        System.out.println ("Enter age");
        int i = scanner.nextInt ();
        if (i <= 19) {
            System.out.println ("Your  Student");
            Personal personal = new Student (i,name);
            System.out.println (personal.toString ());


        } else {

            System.out.println ("Your Empoyee");
            Personal personal = new Empoyee (i,name);
            System.out.println (personal.toString ());


        }


    }
}