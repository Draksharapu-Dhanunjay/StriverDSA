package com.dhanunjay.basicMath;

import java.util.Scanner;

public class ReverseInteger {
    /*
        Sample Input : 124
        Expected Output : 421
        Sample Input : -123
        Expected Output : -321
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.println("Reverse Number : " + reverse(num));
    }
    /*
        Time Complexity : O(Log(N))
        Space Complexity: O(1)
     */
    public static int  reverse(int x) {
        boolean isNegative = x < 0;
        if(isNegative){
            x = -x;
        }
        long reverse = 0;
        while(x > 0){
            reverse = reverse * 10 + x % 10;
            if(reverse > Integer.MAX_VALUE){
                return 0;
            }
            x /= 10;
        }
        return isNegative? (int)-reverse : (int)reverse;
    }
}
