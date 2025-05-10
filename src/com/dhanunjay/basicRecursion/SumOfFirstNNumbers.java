package com.dhanunjay.basicRecursion;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        System.out.println("Sum : " + sum(n));;
    }
    /*
        Time Complexity : O(N)
        Space Complexity: O(N)
     */
    public static int sum(int n){
        if(n <= 1){
            return n;
        }
        return n + sum(n - 1);
    }
}
