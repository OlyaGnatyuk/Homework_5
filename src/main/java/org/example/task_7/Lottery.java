package org.example.task_7;

import java.util.ArrayList;
import java.util.Collections;

public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>();

        for (int number = 1; number <= 100; number++) {
            lottery.add(number);
        }

        Collections.shuffle(lottery);

        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.get(i));
        }
    }
}
