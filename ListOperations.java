package org.example;

import java.util.*;

public class ListOperations {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        intList.ensureCapacity(10);
        System.out.println("Before trim, list: " + intList);

        intList.trimToSize();
        System.out.println("After trimToSize: " + intList);


        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "cherry", "apple"));
        System.out.println("\nOriginal fruit list: " + fruitList);

        Collections.replaceAll(fruitList, "apple", "orange");
        System.out.println("After replacing 'apple' with 'orange': " + fruitList);


        ArrayList<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 1));
        System.out.println("\nList with duplicates: " + listWithDuplicates);
        Set<Integer> duplicates = findDuplicates(listWithDuplicates);
        System.out.println("Duplicates found: " + duplicates);


        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
        System.out.println("\nFirst list: " + firstList);
        System.out.println("Second list: " + secondList);
        List<Integer> uniqueElements = symmetricDifference(firstList, secondList);
        System.out.println("Unique elements from both lists: " + uniqueElements);

        List<String> colors = new ArrayList<>(Arrays.asList("red", "blue", "green", "red"));
        System.out.println("\nOriginal color list: " + colors);

        Set<String> colorSet = new HashSet<>(colors);
        System.out.println("Converted to set (duplicates removed): " + colorSet);

        List<String> listFromSet = new ArrayList<>(colorSet);
        System.out.println("Converted back to list: " + listFromSet);


        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println("\nOriginal list before rotation: " + numbers);
        int rotatePositions = 2;
        rotateLeft(numbers, rotatePositions);
        System.out.println("List after rotating left by " + rotatePositions + " positions: " + numbers);
    }


    private static Set<Integer> findDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer num : list) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }


    private static List<Integer> symmetricDifference(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        union.removeAll(intersection);
        return new ArrayList<>(union);
    }


    private static <T> void rotateLeft(List<T> list, int positions) {
        Collections.rotate(list, -positions);
    }
}
