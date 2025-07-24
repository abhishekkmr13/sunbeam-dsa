package com.self.dsa.day2;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        //For binary search the array must be sorted
        int[] arr = {11,22,33,44,55,66,77,88,99};
        System.out.println("Enter value to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int indexOfResult = binarySearch(arr,key,0,arr.length-1);
        if(indexOfResult == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index " + indexOfResult);
        }

    }

    public static int binarySearch(int[] arr, int target, int leftIdx, int rightIdx) {

        //breaking condition
        if(leftIdx > rightIdx){
            return -1;
        }

        //Find the middle index
        int middleIdx = (leftIdx + rightIdx) / 2;

        if(middleIdx == target){
            return middleIdx;
        }else if(middleIdx < target){
            return binarySearch(arr, target, leftIdx, middleIdx - 1);
        }else{
            return binarySearch(arr, target, middleIdx + 1, rightIdx);
        }
    }
}
