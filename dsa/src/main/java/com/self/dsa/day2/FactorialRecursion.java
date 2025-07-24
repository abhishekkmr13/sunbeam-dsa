package com.self.dsa.day2;

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        //Break condition
        if(n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}
