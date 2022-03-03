class Solution {
    public int maxStockPrice(int[] price,int n) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        int num = 1;
        int i = -1;
        while(i < price.length -1){
            while (num <= n) {
                i++;
                if (i > price.length - 1){
                    mp.clear();
                    break;
                }
                if (mp.containsKey(price[i])) {
                    num = i - mp.get(price[i]);
                    for(int j = 1; j<n-num && i- num -j>=0; j++){
                        mp.remove(price[i- num -j]); //remove element that went before replica
                    }
                }
                mp.put(price[i], i);
                num++;
            }
            int sum = 0;

            for (int s: mp.keySet()){
                sum += s;
            }
            res = Math.max(sum, res);
            num--;
            if(i- num + 1 < price.length){
                mp.remove(price[i- num + 1]); //remove 1 element
            }
        }
        return res;
    }
}
