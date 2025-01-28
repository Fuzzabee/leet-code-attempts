import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_2658 sol = new Solution_2658();

        int[][][] s = {
            { {0,2,1,0}, {4,0,0,3}, {1,0,0,4}, {0,3,2,0} },
            { {1,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,1} },
            { {4,0} }
        };

        for (int[][] i : s) {
            int result = sol.findMaxFish(i);

            System.out.println(result);
        }
    }
}