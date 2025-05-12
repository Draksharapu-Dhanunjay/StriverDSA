package com.dhanunjay.arrays.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    /*
        Sample Input : 5
        Expected Output :  10 -1 89 24 22
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
        Space Complexity: O(n)
     */
    public static void sort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int mid = (left + right) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, index = 0;
        while (i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[index++] = arr[i++];
            }else{
                temp[index++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[index++] = arr[i++];
        }
        while(j <= right){
            temp[index++] = arr[j++];
        }
        index = 0;
        while(index < right - left + 1){
            arr[left + index] = temp[index];
            index++;
        }
    }
}
