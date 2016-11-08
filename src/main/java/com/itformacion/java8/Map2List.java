package com.itformacion.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map2List {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "peach");

        List<Integer> result = map.entrySet().stream()
                .map(x -> x.getKey())
                .collect(Collectors.toList());
        
        result.forEach(System.out::println);
    }
}