class Solution {
    public int maxAggregateTemp(int[] temp) {
        int max = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;
        int sum = 0;
        for (int i: temp){
            sum+=i;
            max = Math.max(sum,max);
            min = Math.min(sum,min);
        }

        return Math.max(max, sum - min);
    }
}
