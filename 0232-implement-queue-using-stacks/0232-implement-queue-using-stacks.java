class MyQueue {
    Stack<Integer> fir;
    Stack<Integer> sec;
    public MyQueue() {
        fir = new Stack<>();
        sec = new Stack<>();
    }
    
    public void push(int x) {
        fir.push(x);
    }
    
    public int pop() {
        this.peek();
        return sec.pop();
    }
    
    public int peek() {
        if(sec.isEmpty()) {
            while(!fir.isEmpty()) {
            sec.push(fir.pop());
            }
        }
        
        return sec.peek();
    }
    
    public boolean empty() {
        return sec.isEmpty() && fir.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */