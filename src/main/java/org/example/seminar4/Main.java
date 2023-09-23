package org.example.seminar4;

import static org.example.seminar4.PearsonCorrelation.calculatePearsonCorrelation;

public class Main {
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5}; // массив x
        double[] y = {2, 4, 5, 6, 7}; // массив y

        double pearsonCorrelation = calculatePearsonCorrelation(x, y);

        System.out.println("Pearson correlation: " + pearsonCorrelation);
    }
}
