package com.dhanunjay.basicRecursion;

/*
    LeetCode : https://leetcode.com/problems/fibonacci-number/
 */
public class FibonacciNumber {
    /*(
        Sample input : 4
        Expected Output : 3
     */
    public static void main(String[] args) {
        int num = 4;
        System.out.println(fib(num));
    }
    /*
        Time Complexity : O(2 ^ n)
        Space Complexity: O(n)
     */
    public static int fib(int n) {
        if(n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
