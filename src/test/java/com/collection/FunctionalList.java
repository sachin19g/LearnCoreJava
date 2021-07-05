package com.collection;

import java.util.ArrayList;
import java.util.List;

public class FunctionalList {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        integers.stream().forEach(e -> System.out.println(e));


    }


}
