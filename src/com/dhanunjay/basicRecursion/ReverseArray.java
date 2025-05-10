package com.dhanunjay.basicRecursion;


import java.util.Arrays;

public class ReverseArray {
    /*
        Sample Input : 1,2,3,4,5,6,7
        Expected Output : [7, 6, 5, 4, 3, 2, 1]
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    /*
        Time Complexity : O(N)
        Space Complexity: O(N)
     */
    public static void reverse(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }
}
