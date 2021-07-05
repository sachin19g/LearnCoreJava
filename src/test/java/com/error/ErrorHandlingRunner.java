package com.error;

import java.util.List;

public class ErrorHandlingRunner {
    public static void main(String[] args) throws Exception {

        ErrorHnadling errorHnadling = new ErrorHnadling ();
        errorHnadling.setList (List.of (1, "sachin", 3));
        try {
            System.out.println (errorHnadling.getList ().get (7));
        } catch (Exception e) {
            e.printStackTrace ();
        }
        System.out.println (errorHnadling.getStr ());
        try {
            System.out.println ("Lenth:- " + errorHnadling.getStr ().length ());

        } catch (Exception w) {
            w.printStackTrace ();
        }
        finally {
            System.out.println ("I am in finally");
        }
    }
}