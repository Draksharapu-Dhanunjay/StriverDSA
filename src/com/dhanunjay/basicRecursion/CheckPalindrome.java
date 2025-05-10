package com.dhanunjay.basicRecursion;

/*
    LeetCode: https://leetcode.com/problems/valid-palindrome/description/
 */
public class CheckPalindrome {
    /*
        Sample Input : A man, a plan, a canal: Panama
        Expected Output : true
     */
    public static void main(String[] args) {
        String str = ".,";
        System.out.println(isPalindrome(str));
    }
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    public static boolean isPalindrome(String s) {
        return isPalindrome(s.toLowerCase(), 0, s.length() - 1);
    }

    public static boolean isPalindrome(String s, int start, int end) {
        if(start >= end) return true;
        while(start <= end && !Character.isLetterOrDigit(s.charAt(start))) start++;
        while(start <= end && !Character.isLetterOrDigit(s.charAt(end))) end--;
        if(start < end && s.charAt(start) != s.charAt(end)){
            return false;
        }
        return isPalindrome(s, start + 1, end - 1);
    }
}
