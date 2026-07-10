class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //first go through each element in the nums array and then store it in hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], (map.getOrDefault(nums[i], 0) + 1) );
        }
        //now sort the hashmap
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a));

        List<Integer> answer = new ArrayList<>();
        int check = nums.length/3;
        for (int j: map.keySet()){
            if (map.get(j) > check){
                answer.add(j);
            }
        }
        return answer;
    }
}

/*
Majority Element II
Medium
Topics
Company Tags
You are given an integer array nums of size n, find all elements that appear more than ⌊ n/3 ⌋ times. You can return the result in any order.

Example 1:

Input: nums = [5,2,3,2,2,2,2,5,5,5]

Output: [2,5]
Example 2:

Input: nums = [4,4,4,4,4]

Output: [4]*/