package org.example.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class House {
    public static void main(String[] args) {
        Map<String, Integer> residents = new HashMap<>();
        residents.put("Иванов Иван Иванович", 38);
        residents.put("Петрова Людмила Васильевна", 25);
        residents.put("Николаева Нина Сергеевна", 35);
        residents.put("Иванов Дмитрий Иванович", 8);
        residents.put("Сидорова Мария Ильинична", 10);
        residents.put("Арбузова Алла Александровна", 80);
        ArrayList<String> names = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: residents.entrySet()) {
            Integer age = entry.getValue();
            if (age > 18) {
                names.add(entry.getKey());
            }
        }

        Collections.sort(names);
        System.out.println(names);
    }
}
