package org.example.task_4;

import java.util.Arrays;

public class TaskNumberFour {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[] {1, 20, 5, -8, 10, 50, 30, 48};

        System.out.println(Arrays.stream(arrayOfNumbers).max());
        System.out.println(Arrays.stream(arrayOfNumbers).min());
    }
}
