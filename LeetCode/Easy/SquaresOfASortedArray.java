class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] Squarenum = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            Squarenum[i] = nums[i]*nums[i];
        }
        Arrays.sort(Squarenum);
        return Squarenum;
    }
}
