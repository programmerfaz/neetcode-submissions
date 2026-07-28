class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        String valid = "abcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < s.length(); i++){
            if (valid.indexOf(s.charAt(i)) != -1){
                sb.append(s.charAt(i));
            }
        }
        if (sb.length() == 1) return true;
        int left = 0, right = sb.length()-1;
        while (left < right){
            if (sb.charAt(left) != sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
Valid Palindrome
Easy
Topics
Company Tags
Hints
Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true*/