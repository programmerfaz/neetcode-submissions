// Longest Common Prefix
// Easy
// Topics
// Company Tags
// You are given an array of strings strs. Return the longest common prefix of all the strings.

// If there is no longest common prefix, return an empty string "".

// Example 1:

// Input: strs = ["bat","bag","bank","band"]

// Output: "ba"
// Example 2:

// Input: strs = ["dance","dag","danger","damage"]

// Output: "da"
// Example 3:

// Input: strs = ["neet","feet"]

// Output: ""
// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] is made up of lowercase English letters if it is non-empty.


class Solution {
    public String longestCommonPrefix(String[] strs) {
        // char[] arr = strs[0].toCharArray();
        // String new_string = "";
        // int length = arr.length;
        // for (int i = 1; i< strs.length; i++){
        //     char[] arr2 = strs[i].toCharArray();
        //     for w(int j = 0; j<length; j++){
        //         if (arr[j] != arr2[j]){
        //             length = j;
        //         }
        //     }
        // }
        // int k = 0;
        // while (k<length){
        //     new_string = new_string+arr[k++];
        // }
        // return new_string;
        String reference = strs[0];
        String new_string = "";
        int index = 0;
        for (char c : reference.toCharArray()){
            // for each character i will do the checking against the other words character
            for (int i = 1; i< strs.length;i++){
                if (index>=strs[i].length() || (strs[i].charAt(index))!=c){
                    return new_string;
                }
            }
            new_string += c;
            index++;
        }
        return new_string;
    }
}