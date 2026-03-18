package com.mycompany.java2n.sp26.sd21301.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void show() {

        Set<String> set = new HashSet<>();
        // 1. add: Note - duplicate, order
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("sky");

        System.out.println(set);


        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // 2.1 Union
//        set1.addAll(set2);
//        System.out.println(set1);

        // 2.2 Intersection
//        set1.retainAll(set2);
//        System.out.println(set1);

        // 2.3 Difference
        set1.removeAll(set2);
        System.out.println(set1);
    }

}

