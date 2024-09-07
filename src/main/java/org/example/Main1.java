package org.example;

public class Main1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }

    public static String getFizzBuzz(int i) {
        if (i % 5 == 0 && i % 7 == 0) {
            return "fizzbuzz";
        } else if (i % 5 == 0) {
            return "fizz";
        } else if (i % 7 == 0) {
            return "buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
