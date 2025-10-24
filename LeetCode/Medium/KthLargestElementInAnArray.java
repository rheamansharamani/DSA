class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;

        int l = 0;
        int r = n-1;

        int pivot_idx = 0;

        while(true){

            pivot_idx = QuickSelect(nums, l, r);
            
            if (pivot_idx == k-1) {
                break;
            }
            else if(pivot_idx > k-1){
                r = pivot_idx - 1;
            }
            else{
                l = pivot_idx + 1;
            }
        }
        return nums[pivot_idx];
    }

    public int QuickSelect(int[] nums, int l, int r){
        int p = nums[l];
        int i = l+1;
        int j = r;

        while(i <= j){   
            if(nums[i] < p && nums[j] > p){
                swap(nums, i, j);
                i++;
                j--;
            }

            if(nums[i] >= p){
                i++;
            }
            if(nums[j] <= p){
                j--;
            }
        }
        swap(nums, l, j);
        return j;
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
