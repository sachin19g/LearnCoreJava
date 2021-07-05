package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest<T> {

    List<T> list1=new ArrayList<>();

    public void addelement(T element){

        list1.add(element);

    }

    public void removeelement (T element) {

        list1.remove(element);


    }
    public List<T> getList1() {
        return list1;
    }
}



