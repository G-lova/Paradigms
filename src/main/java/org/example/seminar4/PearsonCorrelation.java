package org.example.seminar4;

import java.util.function.DoubleBinaryOperator;

public class PearsonCorrelation {


    public static double calculatePearsonCorrelation(double[] x, double[] y) {
        // Расчет средних значений x и y
        double meanX = calculateMean(x);
        double meanY = calculateMean(y);

        // Сумма произведений отклонений от средних
        double sumXY = calculateSum(x, y, (xi, yi) -> (xi - meanX) * (yi - meanY));

        // Квадратных корней из суммы квадратов отклонений от средних
        double sumXSquared = calculateSum(x, x, (xi, xj) -> Math.pow(xi - meanX, 2));
        double sumYSquared = calculateSum(y, y, (yi, yj) -> Math.pow(yi - meanY, 2));

        // Расчет корреляции Пирсона
        double pearsonCorrelation = sumXY / (Math.sqrt(sumXSquared) * Math.sqrt(sumYSquared));

        return pearsonCorrelation;
    }

    public static double calculateMean(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static double calculateSum(double[] x, double[] y, DoubleBinaryOperator operator) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += operator.applyAsDouble(x[i], y[i]);
        }
        return sum;
    }
}