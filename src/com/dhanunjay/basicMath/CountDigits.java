package com.dhanunjay.basicMath;

import java.util.Scanner;

public class CountDigits {
    /*
        Sample Input : 12345
        Expected Output : 5
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.println("Digits Count : " + digitsCount(num));
        System.out.println("Digits Count : " + (int)(Math.log10(num) + 1));
    }
    /*
        Time Complexity : O(log(n))
        Space Complexity: O(1)
     */
    public static int digitsCount(int num){
        int digitsCount = 0;
        while(num > 0){
            digitsCount++;
            num /= 10;
        }
        return digitsCount;
    }
}
