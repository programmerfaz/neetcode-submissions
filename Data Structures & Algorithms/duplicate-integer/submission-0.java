class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.HashMap <Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i< nums.length; i++){
            if (map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}