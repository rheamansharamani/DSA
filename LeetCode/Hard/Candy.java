class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if(n == 1) return 1;
        int candies = 1;
        int i = 1;

        while( i < n){
            if(ratings[i] == ratings[i-1]){
                candies += 1;
                i++;
                continue;
            }
            int up = 0;
            while(i < n && ratings[i] > ratings[i-1]){
                up++;
                candies += up + 1;
                i++;
            }
            int down = 0;
            while(i < n && ratings[i-1] > ratings[i]){
                down++;
                candies += down + 1;
                i++;
            }
            candies -= Math.min(up,down);
        }
        return candies;
    }
}
