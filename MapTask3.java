package org.example;

import java.util.*;
public class MapTask3 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>(new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.compareTo(s2);
            }
        });
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");
        String keyToSearch = "B";
        if(map.containsKey(keyToSearch)){
            System.out.println("Key found: " + keyToSearch);
        }
        if(map.containsValue("Cherry")){
            System.out.println("Value found: Cherry");
        }
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        map.clear();
        System.out.println("Map size after clearing: " + map.size());
    }
}
