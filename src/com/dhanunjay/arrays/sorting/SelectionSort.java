package com.dhanunjay.arrays.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    /*
        Sample Input : 5
        Expected Output : 10 -1 89 24 22
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
        selectionSort(arr, size);
        System.out.println(Arrays.toString(arr));
    }
    /*
        Time Complexity : O(n^2)
        Space Complexity: O(1)
     */
    public static void selectionSort(int[] arr, int size){
        for(int i = 0; i < size - 1; i++){
            int minIndex = i;
            for(int j = i; j < size; j++){
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
