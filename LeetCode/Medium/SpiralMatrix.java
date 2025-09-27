class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> array= new ArrayList<>();
        int m = matrix.length , n = matrix[0].length;
        int srow = 0, erow = m-1 , scol = 0 , ecol = n-1;

        while(srow <= erow && scol <= ecol){
            for(int j=scol; j<= ecol; j++){
                array.add(matrix[srow][j]);
            }

            for(int i=srow+1; i<=erow; i++){
                array.add(matrix[i][ecol]);
            }
            
            if (srow < erow) {
                for(int j=ecol-1; j>=scol; j--){
                    array.add(matrix[erow][j]);
                }
            }

            if (scol < ecol) {
                for(int i=erow-1; i>=srow+1; i--){
                    array.add(matrix[i][scol]);
                }
            }
            srow++; erow--; scol++; ecol--;
        }
        return array;
    }
}
