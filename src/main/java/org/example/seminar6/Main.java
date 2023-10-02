package org.example.seminar6;

import static org.example.seminar6.BinarySearch.binarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        int target = 4;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Элемент не найден");
        } else {
            System.out.println("Индекс элемента: " + result);
        }
    }
}
