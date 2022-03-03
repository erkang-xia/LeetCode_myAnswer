class Solution {
    public int minWordToAdd(String SearchWord, String ResultWord) {
        int i = 0;
        int finished = ResultWord.length();
        int res = 0;
        for (char c : SearchWord.toCharArray()){
            if (c == ResultWord.charAt(i)){
                i++;
                if (i == finished){
                    break;
                }
            }
        }
        res = finished - i;
        return res;
    }
}
