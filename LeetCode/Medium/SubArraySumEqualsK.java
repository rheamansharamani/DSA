class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1; i<nums.length; i++){

        prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        
        for(int j=0; j<nums.length; j++){
            if(prefixSum[j]==k){
                result++;
            }
            int val = prefixSum[j]-k;
            if(map.containsKey(val)){
                result+=map.get(val);
            }
            map.put(prefixSum[j], map.getOrDefault(prefixSum[j],0)+1);
            }
        return result;
    }
}
