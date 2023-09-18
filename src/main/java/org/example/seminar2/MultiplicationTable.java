package org.example.seminar2;

public class MultiplicationTable {
    public static void singleMultiplicationTable(int m) {
        for (int i = 1; i <= 9; i++) {
            int result = m * i;
            System.out.println(m + " * " + i + " = " + result);
        }
    }
    public static void multiMultiplicationTable (int n) {
        for (int i = 1; i <= n; i++) {
            singleMultiplicationTable(i);
            System.out.println();
        }
    }
}
