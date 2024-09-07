package org.example;

public class Main4 {
    public static void main(String[] args) {
        double sum = calculateSeriesSum();
        System.out.println("Сумма ряда: " + sum);
    }

    public static double calculateSeriesSum() {
        double sum = 0.0;
        double term;
        int n = 2; // Начальное значение n

        // Вычисляем члены ряда и суммируем их
        do {
            term = 1.0 / (Math.pow(n, 2) + n - 2);
            sum += term;
            n++;
        } while (term >= 1e-6); // Продолжать до тех пор, пока очередной член >= 10^-6

        return sum;
    }
}
