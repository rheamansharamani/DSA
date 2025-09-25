// Brute-force solution

//class Solution {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int[] ans = new int[nums.length - k + 1];
//        Arrays.fill(ans, 0);
//        if (nums.length == 0 || k == 0) return new int[0];
//        for(int i=0; i<=nums.length - k; i++){
//            int maxVal = nums[i];
//            for(int j = i; j<i+k; j++){
//               maxVal = Math.max(maxVal, nums[j]);
//            }
//            ans[i] = maxVal;
//        }
//        return ans;
//    }
//}

//Optimal solution

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        if(n == 0 || k == 0) return new int[0];
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            if(!queue.isEmpty() && queue.peekFirst() <= i-k){
                queue.pollFirst();
            }

            while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]){
                queue.pollLast();
            }
            
            queue.offerLast(i);
            
            if(i >= k-1){
                ans[i - k + 1] = nums[queue.peekFirst()];
            }
        }
        return ans;
    }
}
