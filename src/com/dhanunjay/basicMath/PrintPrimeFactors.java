package com.dhanunjay.basicMath;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintPrimeFactors {
    /*
        Sample Input : 24
        Expected Output :
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        printPrimeFactors(num);
    }
    /*
        Time Complexity : O(sqrt(n))
        Space Complexity: O(n)
     */
    public static void printPrimeFactors(int num){
        ArrayList<Integer> result = new ArrayList<>();
        while(num % 2 == 0){
            result.add(2);
            num /= 2;
        }
        for(int i = 3; i * i <= num; i += 2){
            while(num % i == 0){
                result.add(i);
                num /= i;
            }
        }
        if(num > 2){
            result.add(num);
        }
        System.out.println(result);
    }
}
