package com.dhanunjay.basicRecursion;

import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        print(n);
    }
    /*
        Time Complexity : O(N)
        Space Complexity: O(N)
     */
    public static void print(int n) {
        if(n <= 0){
            return;
        }
        System.out.print(n + " ");
        print(n - 1);
    }
}
