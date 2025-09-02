class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a,b) -> a[0] == b[0] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
        int ans=0;
        for(int i=0; i < points.length; i++){
            int topY = points[i][1]; 
            int maxY = Integer.MIN_VALUE;

            for(int j=i+1; j<points.length; j++){
                int yj = points[j][1];
                if(yj<=topY && yj>maxY){
                    ans++;
                    maxY=yj;
                }
            }
        }
        return ans;
    }
}
