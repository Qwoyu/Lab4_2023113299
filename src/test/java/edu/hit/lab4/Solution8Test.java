package edu.hit.lab4;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution8Test {
    @Test
    public void example1() {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        Solution8 s = new Solution8();
        assertEquals(1, s.numIslands(copy(grid)));
    }

    @Test
    public void example2() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        Solution8 s = new Solution8();
        assertEquals(3, s.numIslands(copy(grid)));
    }

    @Test
    public void emptyGrid() {
        char[][] grid = {};
        Solution8 s = new Solution8();
        assertEquals(0, s.numIslands(grid));
    }

    private char[][] copy(char[][] g) {
      if (g.length == 0) return g;
      char[][] c = new char[g.length][g[0].length];
      for (int i=0;i<g.length;i++) {
        System.arraycopy(g[i],0,c[i],0,g[i].length);
      }
      return c;
    }

    // 修复：恢复正确期望，确保 CI 通过
    @Test
    public void intentionalFailure_fixed() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        Solution8 s = new Solution8();
        assertEquals(3, s.numIslands(copy(grid)));
    }
}
