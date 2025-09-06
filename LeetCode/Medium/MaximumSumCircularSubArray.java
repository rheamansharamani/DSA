class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentMax = 0, maxSum = nums[0] , currentMin = 0, minSum = nums[0], totalSum = 0;
        for(int val : nums){
            currentMax = Math.max(val , val + currentMax); 
            maxSum = Math.max(maxSum , currentMax);

            currentMin = Math.min(val , val + currentMin); 
            minSum = Math.min(minSum , currentMin);

            totalSum+=val;
        }
        return maxSum > 0? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}
