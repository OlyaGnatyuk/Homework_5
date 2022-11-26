package org.example.task_6;

import java.util.ArrayList;
import java.util.Collections;

public class SunSystem {
    public static void main(String[] args) {
        ArrayList<String> sunSystem = new ArrayList<>();
        sunSystem.add("mercury");
        sunSystem.add("venus");
        sunSystem.add("earth");
        sunSystem.add("mars");
        sunSystem.add("jupiter");
        sunSystem.add("saturn");
        sunSystem.add("neptune");
        sunSystem.add("uranus");
        System.out.println(sunSystem);

        Collections.swap(sunSystem, 6, 7);
        System.out.println(sunSystem);
    }
}
