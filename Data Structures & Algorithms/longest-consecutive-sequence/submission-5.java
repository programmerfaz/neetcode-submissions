/*Longest Consecutive Sequence
Medium
Topics
Company Tags
Hints
Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.

A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element. The elements do not have to be consecutive in the original array.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [2,20,4,10,3,4,5]

Output: 4
Explanation: The longest consecutive sequence is [2, 3, 4, 5].*/
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 1;
        Arrays.sort(nums);
        // for (int k: nums){
        //     System.out.println(k);
        // }
        int element = nums[0];
        int highest = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == element) continue;
            else if ((nums[i] - element) == 1 || (element - nums[i]) == 1) {
                count++;
                element = nums[i];
                if (count > highest) highest = count;
            }
            else {
                count = 1; //set the counter to 1;
                element = nums[i];
            }
            // System.out.println(count);
        }
        return highest;
    }
}
