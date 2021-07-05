package com.collection;

import org.junit.Test;

public class CollectionRunner {

    public static void main(String[] args) {

//        CollectionTest<String> list = new CollectionTest<>();
//        list.addelement("Sachin");
//        list.addelement("VIhaan");
//        System.out.println(list.getList1());

        CollectionTest<Integer> list = new CollectionTest<>();
        list.addelement(1);
        list.addelement(2);
        System.out.println(list.getList1());

    }

}
