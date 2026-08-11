class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minimum;
    public MinStack() {
        stack = new ArrayDeque<>();
        minimum = new ArrayDeque<>();
    }
    
    public void push(int val) {
        if (minimum.isEmpty()) {
            stack.push(val);
            minimum.push(val);
        }
        else{
            minimum.push(Math.min(minimum.peek(), val));
            stack.push(val);
        }
    }
    
    public void pop() {
        stack.pop();
        minimum.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if (minimum.isEmpty()) return -1;
        else return minimum.peek();
    }
}
