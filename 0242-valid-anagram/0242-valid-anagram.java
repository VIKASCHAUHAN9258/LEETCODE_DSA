class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        // Two arrays for frequency count in both s and t
        int [] freq_S = new int[26];
        int [] freq_T = new int[26];
        for(int i=0; i<s.length(); i++){
            freq_S[s.charAt(i) - 'a']++;
        }
           for(int j=0; j<t.length(); j++){
            freq_T[t.charAt(j) - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(freq_S[i]!=freq_T[i]){
                return false;
            }
        }
        return true;
    }
}