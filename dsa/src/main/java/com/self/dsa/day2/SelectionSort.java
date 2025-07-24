package com.self.dsa.day2;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int inputArr[]={5,2,6,4,1};
        System.out.println("Sorted : ");
        Arrays.stream(selectionSort(inputArr)).forEach(System.out::println);
    }

    public static int[] selectionSort(int[] inputArr) {

        for(int i = 0; i < inputArr.length-1; i++) {
            for(int j = i+1; j < inputArr.length; j++) {
               if(inputArr[i] > inputArr[j]) {
                   int temp = inputArr[i];
                   inputArr[i] = inputArr[j];
                   inputArr[j] = temp;
               }
            }
        }
        return inputArr;
    }

}


