class Solution {
    public int commonPrefixLength(String s) {
        int length = s.length();
        int[] z = new int[length];
        int l = 0;
        int r = 0;
        int res = 0;
        for(int i = 1; i<length ; i++){
            if (i<=r){
                z[i] = Math.min(r - i + 1, z[i - l]);
            }
            while (i + z[i] < length && s.charAt(z[i]) == s.charAt(i + z[i])){
                z[i] += 1;
            }
            if (i + z[i] - 1 > r){
                l = i;
                r = i+z[i] - 1;
            }

        }
        for(int num :  z){
            res+=num;
        }

        return length + res;
    }
}
