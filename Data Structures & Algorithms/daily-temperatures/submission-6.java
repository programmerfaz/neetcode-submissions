class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = temperatures.length-1; i > -1; i--){
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()){
                stack.push(i);
                result[i] = 0;
            }
            else {
                result[i] = stack.peek() - i;
                stack.push(i);
            }
        }
        return result;
    }
}
/*
Daily Temperatures
Medium
Topics
Company Tags
Hints
You are given an array of integers temperatures where temperatures[i] represents the daily temperatures on the ith day.

Return an array result where result[i] is the number of days after the ith day before a warmer temperature appears on a future day. If there is no day in the future where a warmer temperature will appear for the ith day, set result[i] to 0 instead.

Example 1:

Input: temperatures = [30,38,30,36,35,40,28]

Output: [1,4,1,2,1,0,0]
Example 2:

Input: temperatures = [22,21,20]

Output: [0,0,0]

        solution 1
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++){
            int j = i+1;
            while (j < temperatures.length && temperatures[j] <= temperatures[i]){
                j++;
            }
            if (j == temperatures.length) result[i] = 0;
            else result[i] = j-i;
        }
        return result;
        
        
*/
