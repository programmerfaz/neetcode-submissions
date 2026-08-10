class Solution {
    public int trap(int[] height) {
        int[] left_max_arr = new int[height.length];
        int[] right_max_arr = new int[height.length];
        left_max_arr[0] = height[0];
        right_max_arr[right_max_arr.length-1] = height[height.length-1];
        int count = 0;
        for (int i = 1; i < height.length; i++){
            left_max_arr[i] = Math.max(height[i], left_max_arr[i-1]);
        }
        for (int j = height.length-2; j>0; j--){
            right_max_arr[j] = Math.max(height[j], right_max_arr[j+1]);
        }
        // print(left_max_arr);
        // print(right_max_arr);
        // print(height);
        for (int k = 1; k < height.length-1; k++){
            count = count + Math.abs(Math.min(left_max_arr[k], right_max_arr[k]) - height[k]);
            // System.out.print(count + " ");
        }
        return count;
    }
    public static void print(int[] arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
/*

int left = 0; 
        while (left < height.length && height[left] == 0) left++;
        int right = left + 2;
        int count = 0;
        while (right < height.length-1){
            while (height[right] < height[left] && right < height.length-1) right++;
            right--;
            for (int i = left+1; i < right; i++){
                if (height[i] >= height[left]) continue;
                count = count + (Math.min(height[left], height[right]) - height[i]);
            }
            left = right;
            right = left + 2;
        }
        return count;
        

        first correct solution

        public int trap(int[] height) {
        int count = 0; 
        if (height.length < 3) return count;
        for (int i = 1; i < height.length-1; i++){
            int left_max = highest(height, 0 , i);
            int right_max = highest(height, i+1, height.length);
            int minimum = Math.min(left_max, right_max);
            if (height[i] < minimum) {
                count = count + (minimum - height[i]);
            }
        }
        return count;
        }
        public static int highest(int[] height, int start, int end){
            int max = 0;
            for (int i = start; i < end; i++){
                if (height[i] > max) max = height[i];
            }
            return max;
        }
*/

/*Trapping Rain Water
Hard
Topics
Company Tags
Hints
You are given an array of non-negative integers height which represent an elevation map. Each value height[i] represents the height of a bar, which has a width of 1.

Return the maximum area of water that can be trapped between the bars.

Example 1:



Input: height = [0,2,0,3,1,0,1,3,2,1]

Output: 9*/