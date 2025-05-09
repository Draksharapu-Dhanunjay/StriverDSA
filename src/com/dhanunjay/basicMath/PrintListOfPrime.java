package com.dhanunjay.basicMath;

import java.util.Scanner;

public class PrintListOfPrime {
    /*
        Sample Input : 2 10
        Expected Output : 2, 3, 5, 7
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int start = scan.nextInt();
        System.out.print("Enter second number : ");
        int end = scan.nextInt();
        brutePrimeList(start, end);
        System.out.println();
        optimalPrimeList(start, end);
    }
    /*
        Time Complexity : O((end - start) * sqrt(end))
        Space Complexity: O(1)
     */
    public static void brutePrimeList(int start, int end){
        for(int i = start; i <= end; i++){
            if(primeCheck(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean primeCheck(int num){
        int divisorCount = 1;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                divisorCount++;
            }
            if(divisorCount >= 2) return false;
        }
        return true;
    }
    /*
        Time Complexity: O(N)
        Space Complexity: O(end + 1)
     */
    public static void optimalPrimeList(int start, int end){
        boolean[] composites = new boolean[end + 1];
        for(int i = 2; i <= end; i++){
            if(!composites[i]){
                for(int j = i * i; j <= end; j = j + i){
                    composites[j] = true;
                }
            }
        }
        for(int i = Math.max(2, start); i <= end; i++){
            if(!composites[i]){
                System.out.print(i + " ");
            }
        }
    }
}
