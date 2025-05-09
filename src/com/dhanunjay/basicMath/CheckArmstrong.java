package com.dhanunjay.basicMath;

import java.util.Scanner;

public class CheckArmstrong {
    /*
        Sample Input : 153
        Expected Output : true
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.println("Is Armstrong : " + isArmstrong(num));
    }
    /*
        Time Complexity : O(log10(num)*log(log10(num)))
        Space Complexity: O(1)
     */
    public static boolean isArmstrong(int num){
        int armstrong = 0, duplicate = num;
        int digits = (int)(Math.log10(num) + 1);
        while(num > 0){
            armstrong += (int)Math.pow(num % 10, digits);
            num /= 10;
        }
        return armstrong == duplicate;
    }
}
