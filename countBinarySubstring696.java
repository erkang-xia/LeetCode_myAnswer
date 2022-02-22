class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0, curr = 1, result = 0;
        
        for(int i = 1; i < s.length(); ++i) {
            if(s.charAt(i - 1) == s.charAt(i)) {
                curr++;
            } else {
                result += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }
        
        return result += Math.min(prev, curr);
    }
}
