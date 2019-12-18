package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n = 11;
        printFibonacciFirstNNumbers(n);
    }

    private static void printFibonacciFirstNNumbers(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    private static int fibonacci(int n) {

        if (n <= 0) {
            return -1;
        }
        if (n < 3) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}