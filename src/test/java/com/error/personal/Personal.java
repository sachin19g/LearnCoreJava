package com.error.personal;

public class Personal {

    private String name = null;
    private Integer age = 0;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name is:- " + name+"   Age is :-" +age;
    }

}