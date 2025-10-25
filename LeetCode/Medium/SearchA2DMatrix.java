class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_idx = potentialRow(matrix, target);
        if(row_idx!=-1) {
            return BinarySearch(matrix, target, row_idx);
        }
        else return false;
    }

    public int potentialRow(int[][] matrix, int target){

        int low = 0;
        int high = matrix.length - 1;
        int idx = matrix[0].length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(matrix[mid][0] <= target && target <= matrix[mid][idx]){
                return mid;
            }else if(matrix[mid][0] > target) {
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return -1;
    }

    public boolean BinarySearch(int[][] matrix, int target, int row_idx){
        int low = 0;
        int high = matrix[row_idx].length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(matrix[row_idx][mid] == target){
                return true;
            }
            else if(matrix[row_idx][mid] > target){
                high = mid - 1; 
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
}
