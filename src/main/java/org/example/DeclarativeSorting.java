package org.example;

import java.util.Arrays;

public class DeclarativeSorting {
    public static int[] sortNumbersDeclarative(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> b - a)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
