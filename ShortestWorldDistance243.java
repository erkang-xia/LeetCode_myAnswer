package com.javalearning;

class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int i1 = 1000, i2 = 10;
        int minDistance = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                i1 = i;
                minDistance = Math.min(minDistance, Math.abs(i1 - i2));
            } else if (words[i].equals(word2)) {
                i2 = i;
                minDistance = Math.min(minDistance, Math.abs(i1 - i2));
            }

        }
        return minDistance;
    }
}
