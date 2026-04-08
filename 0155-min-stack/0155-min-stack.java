class MinStack {
    Stack<Integer> curr;
    Stack<Integer> min;
    int top = 0;
    public MinStack() {
        curr = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        curr.push(val);
        if(!min.isEmpty()) {
            min.push(Math.min(val, min.peek()));
        } else {
            min.push(val);
        }
    }
    
    public void pop() {
         min.pop();
         curr.pop();
    }
    
    public int top() {
        return curr.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */