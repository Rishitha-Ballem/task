package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class GenericCounter {
    public static <T> int countElements(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }
    /*--------------------------------------------*/
    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid indices: " + index1 + ", " + index2);
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    /*--------------------------------------------*/
    public static <T extends Number> void sumOfEvenOdd(List<T> numbers) {
        double evenSum = 0, oddSum = 0;

        for (T num : numbers) {
            if (num.intValue() % 2 == 0) {
                evenSum += num.doubleValue();
            } else {
                oddSum += num.doubleValue();
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
    /*--------------------------------------------*/
    public static <T> int findFirstIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
    /*--------------------------------------------*/
    public static <T extends Comparable<T>> T maximum(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }
    /*--------------------------------------------*/
    public static void main(String[] args) {
        // Integer List
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Count of odd numbers: " + countElements(intList, n -> n % 2 != 0));
        System.out.println("First occurrence of 5: " +findFirstIndex(intList, 5));
        sumOfEvenOdd(intList);

        // Double List
        List<Double> doubleList = List.of(1.5, 2.0, 3.7, 4.2, 5.8, 6.9, 7.1);
        sumOfEvenOdd(doubleList);

        // Character List
        List<Character> charList = List.of('a', 'b', 'c', 'd', 'e', 'b');
        System.out.println("First occurrence of 'b': " +findFirstIndex(charList, 'b'));

        // String List
        List<String> strList = List.of("apple", "banana", "cherry", "date", "apple");
        System.out.println("First occurrence of 'apple': " + findFirstIndex(strList, "apple"));

        // Array Swapping
        Integer[] intArray = {10, 20, 30, 40, 50};
        System.out.println("Before swap: " + Arrays.toString(intArray));
        swapElements(intArray, 1, 3);
        System.out.println("After swap: " + Arrays.toString(intArray));

        String[] strArray = {"one", "two", "three", "four"};
        System.out.println("\nBefore swap: " + Arrays.toString(strArray));
        swapElements(strArray, 0, 2);
        System.out.println("After swap: " + Arrays.toString(strArray));

        // Finding Maximum
        System.out.println("\nMax of 15 and 25: " + maximum(15, 25));
        System.out.println("Max of 3.14 and 2.71: " + maximum(3.14, 2.71));
        System.out.println("Max of 'apple' and 'banana': " +maximum("apple", "banana"));
    }
}
