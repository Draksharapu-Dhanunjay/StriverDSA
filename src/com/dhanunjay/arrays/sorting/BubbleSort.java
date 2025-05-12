package com.dhanunjay.arrays.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
        bubbleSort(arr, size);
        System.out.println(Arrays.toString(arr));
    }
    /*
        Time Complexity : O(n^2)
        Space Complexity: O(1)
     */
    public static void bubbleSort(int[] arr, int size){
        for(int i = 0; i < size; i++){
            boolean isSorted = true;
            for(int j = 0; j < size - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
}
