class Solution 
{
    // Value of first element must be a one -> go decrement that accordingly!
    public int maximumElementAfterDecrementingAndRearranging(int[] arr)
    {
        Arrays.sort(arr);
        arr[0] = 1; // forced decreemnt here
        int maxEl = arr[0]; // by default
        for(int i = 1; i < arr.length; ++i)
        {
            int diff = arr[i] - arr[i-1];
            if(diff > 1)
                arr[i] = arr[i-1] + 1;
            if(diff >= 1)
                maxEl = arr[i];
        }
        return maxEl;
    }
}
