package com.functionalprograming;

import java.util.List;

public class FunctionalProgramRunner {
    public static void main(String[] args) {

        FunctionalProgramList functionalProgramList=new FunctionalProgramList ();

        List<String> list=functionalProgramList.getList();

        list.stream().filter (e->e.endsWith ("at")).forEach (e-> System.out.println (e));

    }
}