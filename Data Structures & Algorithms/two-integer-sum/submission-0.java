class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(target - nums[i], i); // store the difference and target value
        }
        return ans;
    }
}
