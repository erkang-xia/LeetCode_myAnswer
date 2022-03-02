class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = 100000;
        int res = 0;

        for(int i = 0; i < nums.length -2; i++){
            int j = i + 1;
            int k = nums.length -1;
            while(j<k ){
                int differ = target - nums[i] - nums[j] - nums[k];
                if (differ > 0) {
                    int absDiffer = Math.abs(differ);
                    if (min > absDiffer) {
                        min = absDiffer;
                        res = target - differ;
                    }
                    j++;
                }else if (differ < 0){
                    int absDiffer = Math.abs(differ);
                    if (min > absDiffer) {
                        min = absDiffer;
                        res = target - differ;
                    }
                    k--;
                } else {
                    res = target;
                    return res;
                }
            }

        }

        return res;

    }
}
