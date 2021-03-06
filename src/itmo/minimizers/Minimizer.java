package itmo.minimizers;

import itmo.Oracle;

public interface Minimizer {
    /**
     * Находит отрезок, в котором лежит точка минимум функции
     * @param oracle источник значений функции
     * @param epsilon точность
     * @param a левая граница минимизации
     * @param b правая граница минимизации
     * @return отрезок, в котором лежит точка минимум функции
     */
    double[] minimize(Oracle oracle, double epsilon, double a, double b);
}
