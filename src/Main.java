import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_2116 sol = new Solution_2116();

        String[] s = { "))()))", "()()", ")" };
        String[] locked = { "010100", "0000", "0" };

        for (int i = 0; i < s.length; i++) {
            boolean answer = sol.canBeValid(s[i], locked[i]);
            System.out.println(answer);
        }
    }
}