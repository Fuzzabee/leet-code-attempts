import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_2429 sol = new Solution_2429();

        int[][] s = {
            { 3, 5 },
            { 1, 12 },
            { 7, 2 },
            { 65, 84 }
        };

        for (int[] i : s) {
            int result = sol.minimizeXor(i[0], i[1]);

            System.out.printf("%d\n", result);
        }
    }
}