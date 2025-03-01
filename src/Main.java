import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_1790 sol = new Solution_1790();

        String[][] s = {
            { "bank", "kanb" },
            { "attack", "defend" },
            { "kelb", "kelb" },
            { "aa", "bb" },
            { "caa", "aaz"}
        };

        for (String[] i : s) {
            boolean result = sol.areAlmostEqual(i[0], i[1]);

            System.out.println(result);
        }
    }
}