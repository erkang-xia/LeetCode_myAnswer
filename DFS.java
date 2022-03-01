package com.javalearning;

import java.util.LinkedList;
import java.util.Queue;

// "static void main" must be defined in a public class.
public class TreasureIsland {
    public static void main(String[] args) {
        char[][] grid = {{'O', 'O', 'D', 'D'},
                {'D', 'O', 'O', 'O'},
                {'D', 'O', 'D', 'X'},
                {'O', 'O', 'O', 'O'}};
        int step = new TreasureIsland().getMinStep(grid);
        System.out.println("step: " + step);
    }

    public int getMinStep(char[][] grid) {
        char[][] visited = grid.clone();
        visited[0][0] = 'D';

        int m = visited.length, n = visited[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        int step = 0;
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while(!queue.isEmpty()) {
            step ++;
            for(int size = queue.size(); size > 0; size--) {
                int[] cur = queue.poll();
                for(int[] dir: dirs) {
                    int dx = cur[0] + dir[0];
                    int dy = cur[1] + dir[1];
                    if(dx >= 0 && dx < m && dy >= 0 && dy < n && visited[dx][dy] != 'D') {
                        if(grid[dx][dy] == 'X') return step;
                        visited[dx][dy] = 'D';
                        queue.offer(new int[]{dx, dy});
                    }
                }
            }
        }
        return -1;
    }
}
