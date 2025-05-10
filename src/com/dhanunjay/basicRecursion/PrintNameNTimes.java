package com.dhanunjay.basicRecursion;

import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scan.nextLine();
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        print(name, n);
    }
    /*
        Time Complexity : O(N)
        Space Complexity: O(N)
     */
    public static void print(String name, int count){
        if(count <= 0){
            return;
        }
        System.out.print(name + " ");
        print(name, count - 1);
    }
}
