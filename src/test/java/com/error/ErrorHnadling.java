package com.error;

import java.util.ArrayList;
import java.util.List;

public class ErrorHnadling {

    private List list = new ArrayList ();

    private String str ;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }



    //    @Override
//    public String toString() {
//        return "ErrorHnadling{" +
//                "list=" + list +
//                ", str='" + str + '\'' +
//                '}';
    //}


}
