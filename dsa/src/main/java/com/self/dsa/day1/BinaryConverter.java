package com.self.dsa.day1;

import java.util.Stack;

public class BinaryConverter {
    public static void main(String[] args) {
        binaryConverterUsingStack(4);
    }

    public static void binaryConverterUsingStack(int input) {
        int remainder = -1;
        Stack<Integer> stack = new Stack<>();
        do{
            remainder = input%2;
            stack.push(remainder);
            input = input /2;
        }while(input > 0);

        System.out.print("Binary Using Stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }

    public static void binaryConverterUsingStringBuilder(int input) {
        int remainder = -1;
        StringBuilder binary=new StringBuilder();
        do{
            remainder = input%2;
            binary.append(remainder);
            input = input /2;
        }while(input > 0);

        System.out.print("Binary Using SB: "+binary.reverse().toString());

    }
}
