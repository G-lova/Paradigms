package org.example.seminar1;

import java.util.Arrays;

import static org.example.seminar1.DeclarativeSorting.sortNumbersDeclarative;
import static org.example.seminar1.ImperativeSorting.sortNumbersImperative;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {9, 5, 3, 7, 1};

        // Сортировка в императивном стиле
        sortNumbersImperative(numbers);
        System.out.println(Arrays.toString(numbers));

        // Сортировка в декларативном стиле
        int[] sortedNumbers = sortNumbersDeclarative(numbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}