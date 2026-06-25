class Solution {
    public int[] getConcatenation(int[] nums) {
        int new_length = nums.length*2;
        int n = nums.length;
        int[] ans = new int[new_length];
        for (int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}