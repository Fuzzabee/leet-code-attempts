public class Solution_1267 {
    public int countServers(int[][] grid) {
        int[] rows = new int[grid[0].length];
        int[] cols = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    rows[j] += 1;
                    cols[i] += 1;
                }
            }
        }

        System.out.println("Rows");
        for (int r : rows) {
            System.out.printf("%d ", r);
        }
        System.out.println("\nCols");
        for (int c : cols) {
            System.out.printf("%d ", c);
        }
        System.out.println();

        int numConnectedServers = 0;

        return numConnectedServers;
    }
}
