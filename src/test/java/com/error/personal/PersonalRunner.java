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
            System.out.println ("Please enter college name");
             scanner = new Scanner (System.in);
            String college=scanner.nextLine ();
            Personal student = new Student (i,name,college);
            System.out.println (student.toString ());


        } else {

            System.out.println ("Your Empoyee");
            Personal personal = new Empoyee (i,name);
            System.out.println (personal.toString ());


        }


    }
}