package org.example;

import java.util.*;
public class MapTask5 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        SortedMap<String, Integer> subMap = map.subMap("B", "E");
        for(Map.Entry<String, Integer> entry : subMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
