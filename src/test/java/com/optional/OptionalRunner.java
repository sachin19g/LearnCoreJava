package com.optional;

import java.util.List;
import java.util.Optional;

public class OptionalRunner {

    public static void main(String[] args) {

        OptionalExmp opbj = new OptionalExmp ();
        String s = opbj.getStr();
        System.out.println (Optional.ofNullable(s).orElse ("null value"));


    }
}