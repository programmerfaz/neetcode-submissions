// Majority Element
// Easy
// Topics
// Company Tags
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times in the array. You may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [5,5,1,1,1,5,5]

// Output: 5
// Example 2:

// Input: nums = [2,2,2]

// Output: 2
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>(); // store number and its occurance
        for (int i = 0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int max_count = Integer.MIN_VALUE;
        int number = -1;
        //loop to get the maximum occurance key from hashmap
        for (int keys : map.keySet()){
            if (map.get(keys)>max_count){
                max_count = map.get(keys);
                number = keys;
            }
        }
        return number;
    }
}