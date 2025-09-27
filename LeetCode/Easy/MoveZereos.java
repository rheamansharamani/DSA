//Brute Force solution

//class Solution {
//    public void moveZeroes(int[] nums) {
//       for(int i=0; i<nums.length; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i] == 0){
//                    nums[i] = nums[j];
//                    nums[j] = 0;
//                }
//            }
//       } 
//    }
// }

//Optimal solution
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++){
                if(nums[i] != 0){
                    nums[j] = nums[i];
                    j++;
                }
            }
        while(j < nums.length){
            nums[j++] = 0;
        }    
    }
}
