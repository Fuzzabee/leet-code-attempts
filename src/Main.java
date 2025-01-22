import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_1765 sol = new Solution_1765();

        int[][][] s = {
            { {0, 1}, {0, 0} },
            { {0, 0, 1}, {1, 0, 0}, {0, 0, 0} }
        };

        for (int[][] i : s) {
            int[][] result = sol.highestPeak(i);

            for (int[] r : result) {
                for (int c : r) {
                    System.out.printf("%d ", c);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}