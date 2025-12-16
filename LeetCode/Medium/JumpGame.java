class Solution {
    public boolean canJump(int[] nums) {
        int final_position = nums.length-1;
        
        for(int index = nums.length-2;index >= 0;index--){
            if(index + nums[index] >= final_position){
                final_position = index;
            }
        }
        return final_position == 0;
    }
}
