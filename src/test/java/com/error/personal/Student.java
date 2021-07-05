package com.error.personal;


public class Student extends Personal {

   String college=null;

    Student(int age,String name,String college){
        super.setAge (age);
        super.setName (name);
        this.college=college;
    }

    @Override
    public String toString() {
        return "  Name is "+super.getName ()+" Age Is:- "+super.getAge ()+"  College Name is:-"+college;
    }
}