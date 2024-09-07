package org.example;

public class Main2 {
    public static void main(String[] args) {
        String str = "make install";
        System.out.println("Исходная строка: " + str);  // Вывод исходной строки
        String reversed = reverseString(str);
        System.out.println("Перевёрнутая строка: " + reversed);  // Вывод перевёрнутой строки
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
