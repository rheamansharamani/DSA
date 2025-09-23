class MinStack {
    Stack<Long> stack;
    long minVal;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        long v = val;
        if(stack.isEmpty()){
            stack.push(v);
            minVal = v;
        }
        else{
            if(v<minVal){
                stack.push(2 * v - minVal);
                minVal = v;
            } else {
                stack.push(v);
            }
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        long top = stack.pop();
        if(top < minVal){
            minVal = 2 * minVal - top;
        }
    }
    
    public int top() {
        long top = stack.peek();
        if(top < minVal){
           return (int)minVal; 
        }
        else {
            return (int)top;
        }
    }
    
    public int getMin() {
        return (int)minVal;
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
