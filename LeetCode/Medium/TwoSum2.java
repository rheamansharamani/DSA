class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        
        while(left < right){
        int sum = nums[left]+nums[right];
        if(sum > target){
            right--;
        }
        if(sum < target){
            left++;
        }
        if(sum == target){
            break;
        }
        }
        return new int[]{left+1,right+1};
    }
}
