class Solution {
    public int calPoints(String[] operations) {
        Deque <Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < operations.length; i++){
            if (operations[i].equals("+")){
                int first = stack.pop();
                int two = stack.pop();
                stack.push(two);
                stack.push(first);
                stack.push(first+two);
            }
            else if (operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                int num = stack.pop();
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