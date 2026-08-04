class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return new ArrayList<>();
        LinkedHashSet<ArrayList<Integer>> result = new LinkedHashSet<>();
        Arrays.sort(nums);
        for (int left = 0; left < nums.length-3; left++){
            int right = left + 1;
            while (right < nums.length-2){
                int i = right+1, j = nums.length-1;
                while (i < j){
                    long sum = (long) nums[left] + nums[right] + nums[i] + nums[j];
                    if (sum == target){
                        //store in hashset
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[left]);
                        list.add(nums[right]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        result.add(list);
                        i++;
                        j--;
                    }
                    if (sum > target) j--;
                    else if (sum < target) i++;
                }
                right++;
            }
        }
        return new ArrayList<>(result);
    }
}
/*4Sum
Medium
Topics
Company Tags
You are given an integer array nums of size n, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Note: [1,0,3,2] and [3,0,1,2] are considered as same quadruplets.

Example 1:

Input: nums = [3,2,3,-3,1,0], target = 3

Output: [[-3,0,3,3],[-3,1,2,3]]
Example 2:

Input: nums = [1,-1,1,-1,1,-1], target = 2

Output: [[-1,1,1,1]]
Constraints:

1 <= nums.length <= 200
-1,000,000,000 <= nums[i] <= 1,000,000,000
-1,000,000,000 <= target <= 1,000,000,000*/