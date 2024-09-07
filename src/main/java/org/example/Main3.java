package org.example;

public class Main3  {
    public static void main(String[] args) {
        double a = 2, b = -4, c = -6;  // Пример уравнения: 2x^2 - 4x - 6 = 0
        solveQuadraticEquation(a, b, c);
    }

    public static String solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            String result = "Корни уравнения: " + root1 + " и " + root2;
            System.out.println(result);
            return result;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            String result = "Один корень: " + root;
            System.out.println(result);
            return result;
        } else {
            String result = "Нет вещественных корней";
            System.out.println(result);
            return result;
        }
    }
}
