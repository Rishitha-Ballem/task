package org.example;

import java.util.*;
public class SetTask3 {
    public static void main(String[] args) {
        Set<String> vehicles = new HashSet<>();
        vehicles.add("Car");
        vehicles.add("Bike");
        vehicles.add("Truck");
        vehicles.add("Bus");
        vehicles.add("Scooter");
        vehicles.remove("Bus");
        boolean exists = vehicles.contains("Car");
        System.out.println("Car exists: " + exists);
        for(String v : vehicles){
            System.out.println(v);
        }
    }
}
