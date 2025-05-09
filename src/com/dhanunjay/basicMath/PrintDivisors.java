package com.dhanunjay.basicMath;

import java.util.Scanner;

public class PrintDivisors {
    /*
        Sample Input : 36
        Expected Output : 1, 2, 3, 4, 6, 9, 12, 18, 36
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        brutePrintDivisors(num);
        System.out.println();
        optimalPrintDivisors(num);
    }
    /*
        Time Complexity : O(num)
        Space Complexity : O(1)
     */
    public static void brutePrintDivisors(int num){
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    /*
        Time Complexity : O(Sqrt(num))
        Space Complexity: O(1)
     */
    public static void optimalPrintDivisors(int num){
        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
                if(num / i != i){
                    System.out.print(num / i + " ");
                }
            }
        }
    }
}
