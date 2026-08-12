class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int num1 = -1, num2 = -1;
        if (tokens.length < 2) return Integer.valueOf(tokens[0]);
        int result = 0;
        for (int i = 0; i < tokens.length; i++){
            if (tokens[i].equals("+")){
                num1 = stack.pop();
                num2 = stack.pop();
                result = num2+num1;
                stack.push(result);
            }
            else if (tokens[i].equals("-")){
                num1 = stack.pop();
                num2 = stack.pop();
                result = num2-num1;
                stack.push(result);
            }
            else if (tokens[i].equals("*")){
                num1 = stack.pop();
                num2 = stack.pop();
                result = num2*num1;
                stack.push(result);
            }
            else if (tokens[i].equals("/")){
                num1 = stack.pop();
                num2 = stack.pop();
                result = num2/num1;
                stack.push(result);
            }
            else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return result;
    }
}
