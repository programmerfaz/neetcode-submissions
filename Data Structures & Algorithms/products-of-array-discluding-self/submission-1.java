/*Products of Array Except Self Medium Topics

Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].

Each product is guaranteed to fit in a 32-bit integer.

Follow-up: Could you solve it in O(n)
O(n) time without using the division operation?

Example 1:

Input: nums = [1,2,4,6]

Output: [48,24,12,8]*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix_sum = new int[nums.length];
        int[] suffix_sum = new int[nums.length];
        int multiply_so_far = 1;
        //calculate the product excluding the current index
        for (int i = 0; i<nums.length; i++){
            prefix_sum[i] = multiply_so_far;
            multiply_so_far = multiply_so_far * nums[i];
        }
        //calculate the suffix sum in a similar fashion to exclude the current index
        multiply_so_far = 1;
        for (int j = nums.length-1; j>-1; j--){
            suffix_sum[j] = multiply_so_far;
            multiply_so_far *= nums[j];
        }
        //now performing the final operation on the nums array
        for (int k = 0; k<nums.length; k++){
            nums[k] = prefix_sum[k] * suffix_sum[k];
        }
        return nums;
    }
}  
