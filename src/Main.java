import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_2657 sol = new Solution_2657();

        int[][][] s = {
            { {1,3,2,4}, {3,1,2,4} },
            { {2,3,1}, {3,1,2} }
        };

        for (int[][] i : s) {
            int[] result = sol.findThePrefixCommonArray(i[0], i[1]);

            for (int n : result) {
                System.out.printf("%d ", n);
            }

            System.out.println();
        }
    }
}