class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length-1 ;
        int max_area = 0, area = -1;
        while (i < j){
            area = Math.min(heights[i],heights[j]) * (j-i);
            max_area = Math.max(area, max_area);
            if (heights[i] < heights[j]) i++;
            else j--;
        }
        return max_area;
    }
}

/*Container With Most Water
Medium
Topics
Company Tags
Hints
You are given an integer array heights where heights[i] represents the height of the 
i
t
h
i 
th
  bar.

You may choose any two bars to form a container. Return the maximum amount of water a container can store.

Example 1:



Input: height = [1,7,2,5,4,7,3,6]

Output: 36
Example 2:

Input: height = [2,2,2]

Output: 4*/
