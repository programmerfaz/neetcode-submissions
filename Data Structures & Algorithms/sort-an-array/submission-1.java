/*sort using insertion sort and then divide and conquer*/

// class Solution {
//     public int[] sortArray(int[] nums) {
//         //solving using insertion sort
//         int sorted = 0;
//         int unsorted = 1;
//         while (unsorted<nums.length){
//             int element = nums[unsorted];
//             int j = sorted;
//             while (j>-1 && nums[j]>element){
//                 nums[j+1] = nums[j];
//                 j--;
//             }
//             nums[j+1] = element;
//             unsorted ++;
//             sorted++;
//         }
//         return nums;
//     }
// }

class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    public static void mergeSort(int[] nums, int left, int right){
        if (left >= right){
            return;
        }
        int middle = left + (right-left)/2;
        mergeSort(nums,left,middle);
        mergeSort(nums,middle+1,right);
        merge(nums, left, right, middle);
    }
    public static void merge(int[] nums, int left, int right, int middle){
        int[] left_arr = Arrays.copyOfRange(nums, left, middle+1);
        int[] right_arr = Arrays.copyOfRange(nums, middle+1, right+1);
        
        int i = 0, j = 0, k = left;
        while (i<left_arr.length && j<right_arr.length){
            if (left_arr[i] < right_arr[j]){
                nums[k++] = left_arr[i++]; 
            }
            else {
                nums[k++] = right_arr[j++];
            }
        }
        //empty either arrays
        while (i<left_arr.length) nums[k++] = left_arr[i++];
        while (j<right_arr.length) nums[k++] = right_arr[j++];
    }
}