class Solution {
    public int calPoints(String[] operations) {
        Deque <Integer> stack = new ArrayDeque<>();
        int first, two, num;
        for (int i = 0; i < operations.length; i++){
            if (operations[i].equals("+")){
                first = stack.pop();
                two = stack.pop();
                stack.push(two);
                stack.push(first);
                stack.push(first+two);
            }
            else if (operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                num = stack.pop();
                stack.push(num);
                num = num * 2;
                stack.push(num);
            }
            else{
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        int count = 0;
        while (!stack.isEmpty()){
            count = count + stack.pop();
        }
        return count;
    }
}

/*Baseball Game
Easy
Topics
Company Tags
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

Given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x: Record a new score of x.

'+': Record a new score that is the sum of the previous two scores.

'D': Record a new score that is the double of the previous score.

'C': Invalidate the previous score, removing it from the record.

Return the sum of all the scores on the record after applying all the operations.

Note: The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

Example 1:

Input: ops = ["1","2","+","C","5","D"]

Output: 18
*/