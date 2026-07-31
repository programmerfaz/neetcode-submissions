class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length){
            int current = nums[left];
            while (right < nums.length && nums[right] == current) right++;
            left++;
            if (right < nums.length) nums[left] = nums[right];
        }
        return left;
    }
}