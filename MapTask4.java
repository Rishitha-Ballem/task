package org.example;

import java.util.*;
public class MapTask4 {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();
        map.put("Bob", 6.0);
        map.put("Alice", 5.6);
        map.put("Charlie", 5.9);
        map.remove("Charlie");
        for(Map.Entry<String, Double> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
