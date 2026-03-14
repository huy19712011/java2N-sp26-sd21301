package com.mycompany.java2n.sp26.sd21301.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {

    public static void show() {

        List<String> list = new ArrayList<>(); // tao list rong

        // 1. all mothods from Collection
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);

        // 2. add at index
        list.add(0, "a");
        list.add(1, "b");

        System.out.println(list);

        // addAll
        Collections.addAll(list, "d", "e", "f");
        System.out.println(list);

        // 3. get
        System.out.println(list.get(2));

        // 4. set
        list.set(2, "A++");
        System.out.println(list.get(2));
        System.out.println(list);

        // 5. remove
        list.remove(0);
        System.out.println(list);

        // 6. indexOf
        System.out.println(list.indexOf("B"));
        System.out.println(list.indexOf("e"));

        // 7. lastIndexOf
        list.add("e");
        System.out.println(list);
        System.out.println(list.lastIndexOf("e"));

        // 8. subList
        System.out.println(list.subList(0, 4));
    }
}
