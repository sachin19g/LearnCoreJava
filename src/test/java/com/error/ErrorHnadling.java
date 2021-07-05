package com.error;

import java.util.ArrayList;
import java.util.List;

public class ErrorHnadling {

    private List list = new ArrayList ();

    private String str;

    public void setStr(String str) {

        if (str == null) {


        } else
            this.str = str;

    }

    public void setList(List list) {
        this.list = list;
    }


    public String getStr() {

        return str;

    }


    public List getList() {

        return list;

    }


}