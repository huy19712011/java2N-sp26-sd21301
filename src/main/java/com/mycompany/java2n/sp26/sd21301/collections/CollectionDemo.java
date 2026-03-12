package com.mycompany.java2n.sp26.sd21301.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {

    public static void show() {

        // 1. add()
        ArrayList<String> collection = new ArrayList<>(); // khoi tao danh sach rong

        collection.add("A");
        collection.add("B");
        collection.add("C");

        for (String item : collection) {
            System.out.println(item);
        }

        System.out.println(collection);

        // 2. addAll()
        Collections.addAll(collection, "d", "e", "f");
        System.out.println(collection);

        // 3. size()
        System.out.println(collection.size());

        // 4. remove, clear
        collection.remove("A");
        System.out.println(collection);

        collection.remove(0);
        System.out.println(collection);

//        collection.clear();
//        System.out.println(collection);

        // 5. contains()
        System.out.println(collection.contains("d")); // true
        System.out.println(collection.contains("D")); // false
    }

}
