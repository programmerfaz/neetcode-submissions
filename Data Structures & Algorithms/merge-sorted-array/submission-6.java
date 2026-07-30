class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lp = m-1;
        int rp = n-1;
        int i = nums1.length-1;
        while (lp > -1 && rp > -1){
            if (nums1[lp] >= nums2[rp]){
                nums1[i] = nums1[lp];
                lp--;
            }
            else if (nums1[lp] < nums2[rp]){
                nums1[i] = nums2[rp];
                rp--;
            }
            i--;
        }
        while (lp>-1){
            nums1[i] = nums1[lp];
            lp--;
            i--;
        }
        while (rp > -1){
            nums1[i] = nums2[rp];
            rp--;
            i--;
        }
    }
}

/*
Merge Sorted Array
Easy
Topics
Company Tags
You are given two integer arrays nums1 and nums2, both sorted in non-decreasing order, along with two integers m and n, where:

m is the number of valid elements in nums1,
n is the number of elements in nums2.
The array nums1 has a total length of (m+n), with the first m elements containing the values to be merged, and the last n elements set to 0 as placeholders.

Your task is to merge the two arrays such that the final merged array is also sorted in non-decreasing order and stored entirely within nums1.
You must modify nums1 in-place and do not return anything from the function.

Example 1:

Input: nums1 = [10,20,20,40,0,0], m = 4, nums2 = [1,2], n = 2

Output: [1,2,10,20,20,40]
Example 2:

Input: nums1 = [0,0], m = 0, nums2 = [1,2], n = 2

Output: [1,2]

another solutione
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lp = m-1;
        int rp = nums2.length-1;
        int i = nums1.length-1;
        while (lp > -1 || rp > -1){
            if (rp < 0 || lp > -1 && nums1[lp] >= nums2[rp]){
                nums1[i] = nums1[lp];
                lp--;
            }
            else if (lp < 0 || rp > -1 && nums1[lp] < nums2[rp] ){
                nums1[i] = nums2[rp];
                rp--;
            }
            i--;
        }
        // while (lp>-1){
        //     nums1[i] = nums1[lp];
        //     lp--;
        //     i--;
        // }
        // while (rp > -1){
        //     nums1[i] = nums2[rp];
        //     rp--;
        //     i--;
        // }
    }
}
*/

