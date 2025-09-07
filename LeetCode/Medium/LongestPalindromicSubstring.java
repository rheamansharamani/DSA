class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;

        String result = s.substring(0,1);
        for(int i=0; i<s.length(); i++){
            int left = i;
            int right = i;

            while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            left--; right++;
            }
        
            String palindrome = s.substring(left+1, right);
            if(palindrome.length() > result.length()){
            result = palindrome;
            }

            left = i-1;
            right = i;

            while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            left--; right++;
            }
            palindrome = s.substring(left+1, right);
            if(palindrome.length() > result.length()){
                result = palindrome;
            }
        }
        return result;
    }
}
