class Solution {
    public int howManySub(String longStr , String shortStr) {
        int res = Integer.MAX_VALUE;
        Map<Character,Integer> mp1 = new HashMap<>();
        Map<Character,Integer> mp2 = new HashMap<>();
        for (char c:longStr.toCharArray()){
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }
        for (char c:shortStr.toCharArray()){
            mp2.put(c,mp2.getOrDefault(c,0)+1);
        }

        for( char c: shortStr.toCharArray()){
            res = Math.min(res,mp1.get(c)/mp2.get(c));
        }
        return res;
    }
}
