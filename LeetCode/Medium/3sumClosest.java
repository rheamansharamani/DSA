class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int resultSum =0;
        int minDifference = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i=0; i<nums.length - 2; i++){
            int left = i+1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target){
                    return target;
                }
                if(sum  < target){
                    left++;
                }
                else{
                    right--;
                }
                int difference = Math.abs(sum - target);
                if(difference < minDifference){
                    resultSum = sum;
                    minDifference = difference;
                }
            }
        }
        return resultSum;
    }
}
