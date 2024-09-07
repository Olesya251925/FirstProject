package org.example;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String testString = scanner.nextLine(); // Считываем строку, введенную пользователем

        if (isPalindrome(testString)) {
            System.out.println("Строка \"" + testString + "\" является палиндромом.");
        } else {
            System.out.println("Строка \"" + testString + "\" не является палиндромом.");
        }

        scanner.close(); // Закрываем сканер
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}