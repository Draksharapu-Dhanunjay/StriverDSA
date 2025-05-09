package com.dhanunjay.basicMath;

import java.util.Scanner;

public class CheckPrime {
    /*
        Sample Input : 7
        Expected Output : true
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.println("Is Prime : " + bruteCheckPrime(num));
        System.out.println("Is Prime : " + optimalCheckPrime(num));
    }
    /*
        Time Complexity : O(num)
        Space Complexity: O(1)
     */
    public static boolean bruteCheckPrime(int num){
        if(num <= 1) return false;
        int divisorCount = 1;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                divisorCount++;
            }
            if(divisorCount == 2){
                return false;
            }
        }
        return true;
    }
    /*
        Time Complexity: O(sqrt(num))
        Space Complexity: O(1)
     */
    public static boolean optimalCheckPrime(int num){
        if(num <= 1) return false;
        int divisorCount = 1;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                divisorCount++;
            }
            if(divisorCount >= 2){
                return false;
            }
        }
        return true;
    }
}
