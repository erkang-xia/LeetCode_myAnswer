class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue <int[]> maxPQ = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for (int i = 0; i < points.length; i++){
            int [] entry = {Distance(points[i]), i};
            if (maxPQ.size() < k){
                maxPQ.add(entry);
            }
            else if(entry[0] < maxPQ.peek()[0]){
                maxPQ.poll();
                maxPQ.add(entry);
            }
        }
        
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i ++){
            int entryIndex = maxPQ.poll()[1];
            res[i] = points[entryIndex];
        }
        return res;
    }
    
    private int Distance(int[] point) {
        // Calculate and return the squared Euclidean distance
        return point[0] * point[0] + point[1] * point[1];
    }
}
