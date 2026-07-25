class Solution {
    public int firstMissingPositive(int[] nums) {
        //first store in hashmap 
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(i+1, false);
        }
        //loop through the array and turn true for all element from the array
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], true);
            }
        }
        //loop thorugh the hashmap and return the first element that is false
        for (int c : map.keySet()){
            if (map.get(c) == false) return c;
        }
        return nums.length+1;
        
    }
}

/*
First Missing Positive
Hard
Topics
Company Tags
You are given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:

Input: nums = [-2,-1,0]

Output: 1
Example 2:

Input: nums = [1,2,4]

Output: 3


one solution

for (int i = 0; i < nums.length; i++){
            if (nums[i] < 1 || nums[i] > nums.length) nums[i] = nums.length+1;
        }
        for (int j = 0; j < nums.length; j++){
            int val = Math.abs(nums[j]);
            if (val <= nums.length && nums[val - 1] > 0) {
                nums[val - 1] = -nums[val - 1];
            }
        }
        for (int k = 0; k < nums.length; k++){
            if (nums[k] > 0){
                return k+1;
            }
        }
        return nums.length+1;
        
*/