package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("andrey@mail.ru", "Andrey Shmider");
        map.put("andrey@mail.ru", "Andrey Shmider");
        map.put("andrey@mail.ru", "Andrey Shmider");
        map.put("vasia122@yandex.ru", "Vasya Pupkin");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
