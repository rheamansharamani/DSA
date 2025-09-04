class Solution {

    private boolean matches(int[] freq, int[] windowFreq){
        for(int i=0; i<26; i++){
            if(freq[i] != windowFreq[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int idx = 0;
        int[] freq = new int[26];
        int[] windowFreq = new int[26];
        if(s1.length()>s2.length()) return false;
        for(char c : s1.toCharArray()){
            freq[c-'a']++;
        }
        int windowSize = s1.length();
        for(int i=0; i<windowSize; i++){
            windowFreq[s2.charAt(i)-'a']++;
        }
        if(matches(freq, windowFreq)) return true;
        for(int i = windowSize; i<s2.length(); i++){
            windowFreq[s2.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i-windowSize) -'a']--;

            if(matches(freq, windowFreq)) return true;
        }   
        return false;
    }
}
