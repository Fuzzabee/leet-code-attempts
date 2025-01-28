public class Solution_2658 {
    public class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (!(o instanceof Point)) {
                return false;
            }

            Point p = (Point) o;

            return p.x == this.x && p.y == this.y;
        }
    }

    public int findMaxFish(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        int maxFish = 0;

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (grid[r][c] > 0) {
                    int numFish = bfs(grid, r, c, 0);
                    if (numFish > maxFish) {
                        maxFish = numFish;
                    }
                } else {
                    grid[r][c] = -1;
                }
            }
        }

        return maxFish;
    }

    public int bfs(int[][] grid, int r, int c, int total) {
        if (grid[r][c] <= 0) {
            grid[r][c] = -1;
            return total;
        }

        total += grid[r][c];
        grid[r][c] = -1;

        // North
        if (c > 0 && grid[r][c - 1] >= 0) {
            total = bfs(grid, r, c - 1, total);
        }

        // South
        if (c < grid[0].length - 1 && grid[r][c + 1] >= 0) {
            total = bfs(grid, r, c + 1, total);
        }

        // West
        if (r > 0 && grid[r - 1][c] >= 0) {
            total = bfs(grid, r - 1, c, total);
        }

        // East
        System.out.printf("r = %d, grid[0].len = %d\n", r, grid[0].length);
        if (r < grid.length - 1 && grid[r + 1][c] >= 0) {
            total = bfs(grid, r + 1, c, total);
        }

        return total;
    }
}
