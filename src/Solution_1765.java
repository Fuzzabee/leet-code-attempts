import java.util.LinkedList;
import java.util.Queue;

public class Solution_1765 {
    public int[][] highestPeak(int[][] isWater) {
        int numRows = isWater.length;
        int numCols = isWater[0].length;
        int[][] height = new int[numRows][numCols];
        Queue<int[]> queue = new LinkedList<>();

        // Setting water heights, -1 for everything else
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (isWater[row][col] == 1) {
                    height[row][col] = 0;
                    int[] pos = new int[2];
                    pos[0] = row;
                    pos[1] = col;
                    boolean result = queue.offer(pos);

                    if (!result) {
                        System.out.println("Something went wrong adding to queue");
                        System.exit(1);
                    }
                } else {
                    height[row][col] = -1;
                }
            }
        }

        // Go through the queue, checking N, E, S, W for -1 positions, adding to queue
        int[] next = queue.poll();
        while (next != null) {
            System.out.printf("Current = (%d, %d)\n", next[0], next[1]);
            int curRow = next[0];
            int curCol = next[1];
            int curValue = height[curRow][curCol];

            // North
            if (curRow != 0) {
                int northRow = curRow - 1;
                if (height[northRow][curCol] == -1) {
                    height[northRow][curCol] = curValue + 1;
                    int[] pos = new int[2];
                    pos[0] = northRow;
                    pos[1] = curCol;
                    boolean result = queue.offer(pos);
                    if (!result) {
                        System.out.println("Something went wrong adding to queue");
                        System.exit(1);
                    }
                }
            }

            // South
            if (curRow != numRows - 1) {
                int southRow = curRow + 1;
                if (height[southRow][curCol] == -1) {
                    height[southRow][curCol] = curValue + 1;
                    int[] pos = new int[2];
                    pos[0] = southRow;
                    pos[1] = curCol;
                    boolean result = queue.offer(pos);
                    if (!result) {
                        System.out.println("Something went wrong adding to queue");
                        System.exit(1);
                    }
                }
            }

            // West
            if (curCol != 0) {
                int westCol = curCol - 1;
                if (height[curRow][westCol] == -1) {
                    height[curRow][westCol] = curValue + 1;
                    int[] pos = new int[2];
                    pos[0] = curRow;
                    pos[1] = westCol;
                    boolean result = queue.offer(pos);
                    if (!result) {
                        System.out.println("Something went wrong adding to queue");
                        System.exit(1);
                    }
                }
            }

            // East
            if (curCol != numCols - 1) {
                int eastCol = curCol + 1;
                if (height[curRow][eastCol] == -1) {
                    height[curRow][eastCol] = curValue + 1;
                    int[] pos = new int[2];
                    pos[0] = curRow;
                    pos[1] = eastCol;
                    boolean result = queue.offer(pos);
                    if (!result) {
                        System.out.println("Something went wrong adding to queue");
                        System.exit(1);
                    }
                }
            }

            next = queue.poll();
        }

        return height;
    }
}
