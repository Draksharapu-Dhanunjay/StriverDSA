package com.dhanunjay.arrays.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    /*
        Sample Input :
                Size : 8
                Array : 5 3 8 4 2 7 1 10
        Expected Output :
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for(int index = 0; index < size; index++){
            arr[index] = scan.nextInt();
        }
        sort(arr, 0, size - 1);
        System.out.println(Arrays.toString(arr));
    }
    /*
        Time Complexity : O(Nlog(N))
        Space Complexity: O(1)
     */
    public static void sort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int index = pivot(arr, left, right);
        sort(arr, left, index - 1);
        sort(arr, index + 1, right);
    }

    public static int pivot(int[] arr, int left, int right){
        int pivotVal = arr[left], start = left + 1, end = right;
        while (start <= end){
            while (start <= end && arr[start] <= pivotVal){
                start++;
            }
            while (start <= end && arr[end] > pivotVal){
                end--;
            }
            if(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        int temp = arr[left];
        arr[left] = arr[end];
        arr[end] = temp;
        return end;
    }
}
