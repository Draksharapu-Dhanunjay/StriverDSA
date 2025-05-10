package com.dhanunjay.basicRecursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        System.out.println("Factorial of " + n + " : " + fact(n));
    }
    /*
        Time Complexity : O(N)
        Space Complexity: O(N)
     */
    public static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
