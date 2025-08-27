class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int max_area = 0;
        while(lp<rp){
           int w = rp - lp;
           int ht = Math.min(height[lp], height[rp]);

           int area = w * ht; 

            max_area = Math.max(max_area, area);

            if (height[lp] < height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max_area;
    }
}
