class Solution {
    public List<Integer> minWordToAdd(int[] data, int[]moveFrom, int[] moveTo) {
        List<Integer> ls = new ArrayList<>();
        for (int c : data){
            ls.add(c);
        }
        for(int i = 0; i < moveTo.length; i ++){
            ls.remove(new Integer(moveFrom[i]));
            ls.add(moveTo[i]);
        }
        Collections.sort(ls);
        return ls;

    }
}
