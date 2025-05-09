package com.dhanunjay.basicMath;

import java.util.Scanner;

public class CheckPalindrome {
    /*
        Sample Input : 121
        Expected Output : true
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.println("Is Palindrome : " + isPalindrome(num));
    }

    /*
        Time Complexity : O(log(n))
        Space Complexity : O(1)
     */
    public static boolean isPalindrome(int x) {
        int duplicate = x, reverse = 0;
        while(x > 0){
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return duplicate == reverse;
    }
}
