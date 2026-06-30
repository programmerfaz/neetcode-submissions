class Solution {
    public int[] sortArray(int[] nums) {
        //solving using insertion sort
        int sorted = 0;
        int unsorted = 1;
        while (unsorted<nums.length){
            int element = nums[unsorted];
            int j = sorted;
            while (j>-1 && nums[j]>element){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = element;
            unsorted ++;
            sorted++;
        }
        return nums;
    }
}