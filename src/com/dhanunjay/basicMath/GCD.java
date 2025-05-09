package com.dhanunjay.basicMath;

import java.util.Scanner;

public class GCD {
    /*
        Sample Input :
        Expected Output :
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scan.nextInt();
        System.out.println(bruteGCD(num1, num2));
        System.out.println(optimalGCD(num1, num2));
    }
    /*
        Time Complexity : O(min(num1, num2))
        Space Complexity: O(1)
     */
    public static int bruteGCD(int num1, int num2){
        int gcd = 1;
        for(int i = 2; i <= Math.min(num1, num2); i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    /*
        Time Complexity: O(log(min(num1, num2)))
        Space Complexity: O(1)
     */
    public static int optimalGCD(int num1, int num2){
        while (num1 > 0 && num2 > 0){
            if(num1 > num2){
                num1 = num1 % num2;
            }else{
                num2 = num2 % num1;
            }
        }
        return Math.max(num1, num2);
    }
}
