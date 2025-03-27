package org.example;

import java.util.*;
public class MapTask2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> original = new TreeMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 3);
        TreeMap<String, Integer> copy = new TreeMap<>();
        copy.putAll(original);
        for(Map.Entry<String, Integer> entry : copy.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
