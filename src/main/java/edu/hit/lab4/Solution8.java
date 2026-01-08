package edu.hit.lab4;
//测试
//新的分支
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 计算二维网格中的岛屿数量：'1' 为陆地，'0' 为水。
 */
public class Solution8 {
    void bfs(char[][] grid, int sr, int sc) {
        int nr = grid.length;
        int nc = grid[0].length;
        Deque<int[]> q = new ArrayDeque<>();
        grid[sr][sc] = '0';
        q.offer(new int[]{sr, sc});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            if (r - 1 >= 0 && grid[r - 1][c] == '1') {
                grid[r - 1][c] = '0';
                q.offer(new int[]{r - 1, c});
            }
            if (r + 1 < nr && grid[r + 1][c] == '1') {
                grid[r + 1][c] = '0';
                q.offer(new int[]{r + 1, c});
            }
            if (c - 1 >= 0 && grid[r][c - 1] == '1') {
                grid[r][c - 1] = '0';
                q.offer(new int[]{r, c - 1});
            }
            if (c + 1 < nc && grid[r][c + 1] == '1') {
                grid[r][c + 1] = '0';
                q.offer(new int[]{r, c + 1});
            }
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int nr = grid.length;
        int nc = grid[0].length;
        int numIslands = 0;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1') {
                    numIslands++;
                    bfs(grid, r, c);
                }
            }
        }
        return numIslands;
    }
}
