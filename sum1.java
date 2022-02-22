class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int compliment;
        for(int i = 0; i < nums.length; i++){
            compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};
            }
            map.put(nums[i],i);
        }
        
        return null;

    }
}
