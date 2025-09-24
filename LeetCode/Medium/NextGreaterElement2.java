class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i=2*n-1; i>=0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i%n]){
                stack.pop();
            }
            ans[i%n] = stack.isEmpty() ? -1 : nums[stack.peek()];
            stack.push(i%n);
        }
        return ans;
    }
}
