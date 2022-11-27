package org.example.task_2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Fox");
        animals.add("Bear");
        animals.add("Rabbit");
        System.out.println(animals);

        Collections.sort(animals);
        System.out.println(animals);

        animals.sort(Collections.reverseOrder());
        System.out.println(animals);

        animals.clear();
        System.out.println(animals);
    }
}
