package org.example.task_5;

import java.util.HashMap;
import java.util.Map;

public class TaskNumberFive {
    public static void main(String[] args) {
        Map<String, Integer> cats = new HashMap<>();
        cats.put("Марсик", 3);
        cats.put("Лёвик", 6);
        cats.put("Сонька", 4);
        cats.put("Вася", 10);

        Map<String, Integer> dogs = new HashMap<>();
        dogs.put("Герда", 5);
        dogs.put("Байкал", 8);
        dogs.put("Пират", 15);
        dogs.put("Барон", 7);

        Map<String, Integer> animals = new HashMap<>();
        animals.putAll(cats);
        animals.putAll(dogs);

        System.out.println(animals);
    }
}
