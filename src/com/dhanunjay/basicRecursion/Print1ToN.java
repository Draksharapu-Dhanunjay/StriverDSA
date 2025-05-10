package com.dhanunjay.basicRecursion;

import java.util.Scanner;

public class Print1ToN {
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
    public static void print(int num){
        if(num <= 0){
            return;
        }
        print(num - 1);
        System.out.print(num + " ");
    }
}
