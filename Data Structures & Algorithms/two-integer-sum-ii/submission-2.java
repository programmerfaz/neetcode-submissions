class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int i = 0, j = numbers.length-1;
        while (i < j){
            if((numbers[j] + numbers[i]) < target){
                i++;
            }
            else if ((numbers[j] + numbers[i]) > target){
                j--;
            }
            else{
                break;
            }

        }
        ans[0] = i+1;
        ans[1] = j+1;
        return ans;
    }
}
/*Two Integer Sum II
Medium
Topics
Company Tags
Hints
Given an array of integers numbers that is sorted in non-decreasing order.

Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2. Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.

There will always be exactly one valid solution.

Your solution must use 
O
(
1
)
O(1) additional space.

Example 1:

Input: numbers = [1,2,3,4], target = 3

Output: [1,2]*/