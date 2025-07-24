package com.self.dsa.day1;

public class TableOfNumber {
    public static void main(String[] args) {
        tableOfNumber(5);
    }

    public static void tableOfNumber(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " X "+n+" = "+(i*n)+"\n");
        }
    }
}
