class Solution {
    public boolean hasSameDigits(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        while(n > 2){
            for(int i=0; i<n-1; i++){
                int sum = ((arr[i] - '0') + (arr[i+1] - '0')) % 10;
                arr[i] = (char)(sum + '0');
            }
            n--;
        }
        return (arr[0] == arr[1]);
    }
}
