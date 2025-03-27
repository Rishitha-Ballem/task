package org.example;

import java.util.*;
public class MapTask1 {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("New York", 8000000);
        cityPopulation.put("Los Angeles", 4000000);
        cityPopulation.put("Chicago", 2700000);
        for(Map.Entry<String,Integer> entry : cityPopulation.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
