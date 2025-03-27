package org.example;

import java.util.*;
public class SetTask2 {
    public static void main(String[] args) {
        Integer[] numbers = {45, 78, 90, 1, 8, 0, 23};
        Set<Integer> linkedSet = new LinkedHashSet<>(Arrays.asList(numbers));
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(numbers));
        Iterator<Integer> it1 = linkedSet.iterator();
        while(it1.hasNext()){
            System.out.print(it1.next() + " ");
        }
        System.out.println();
        Iterator<Integer> it2 = treeSet.iterator();
        while(it2.hasNext()){
            System.out.print(it2.next() + " ");
        }
        System.out.println();
    }
}
