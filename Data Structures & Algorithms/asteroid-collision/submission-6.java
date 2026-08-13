class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> reverse = new ArrayDeque<>();
        for (int i = 0; i < asteroids.length; i++){
            while (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0){
                int diff = asteroids[i] + stack.peek();
                if (diff < 0) {
                    stack.pop();
                }
                else if (diff == 0) {
                    asteroids[i] = 0;
                    stack.pop();
                }
                else{
                    asteroids[i] = 0;
                }
            }
            if (asteroids[i] != 0) stack.push(asteroids[i]);
        }
        int length = 0;
        while (!stack.isEmpty()){
            reverse.push(stack.pop());
            length++;
        }
        int[] ans = new int[length];
        int j = 0;
        while (!reverse.isEmpty()){
            ans[j++] = reverse.pop(); 
        }
        return ans;
    }
}

/*Asteroid Collision
Medium
Topics
Company Tags
You are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

Example 1:

Input: asteroids = [2,4,-4,-1]

Output: [2]
Example 2:

Input: asteroids = [5,5]

Output: [5,5]
Example 3:

Input: asteroids = [7,-3,9]

Output: [7,9]

*/