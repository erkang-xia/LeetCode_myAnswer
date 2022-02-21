package com.javalearning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {

    public int minMeetingRooms(int[][] intervals) {
        int[] startTime = new int[intervals.length ];
        int[] endTime = new int[intervals.length ];
        int count = 0;
        int m = 0;
        int n = 0;
        int res = 0;
        for(int i = 0; i< intervals.length; i++){
            startTime[i] = intervals[i][0];
            endTime[i] = intervals[i][1];
        }
        Arrays.sort(startTime);
        Arrays.sort(endTime);

        while(m < startTime.length){
            if (startTime[m] < endTime[n]){
                count++;
                m++;
                res = Math.max(res,count);
            }
            else{
                count--;
                n++;

            }
        }

        return res;
    }
}
