package com.self.dsa.day1;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial2(10));
    }

    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int factorial2(int n) {
        return n>0 ? n*factorial2(n-1):1;
    }
}
