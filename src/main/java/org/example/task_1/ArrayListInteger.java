package org.example.task_1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(7);
        numbers.add(10);
        numbers.add(2);
        numbers.add(0);
        numbers.add(9);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);
    }
}
