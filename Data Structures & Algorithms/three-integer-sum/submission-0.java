class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return new ArrayList<>();
        Set<List<Integer>> set = new HashSet();
        int n1 = 0;
        //first we sort the nums
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++){
            n1 = nums[i];
            int j = i+1;
            int k = nums.length-1;
            while (j < k){
                int sum = n1 + nums[j] + nums[k];
                if (sum == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(n1);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    set.add(list);
                }
                if (sum < 0){
                    j++;
                }
                else if (sum > 0){
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
