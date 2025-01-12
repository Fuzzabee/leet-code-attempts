import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_2185 s = new Solution_2185();

        String[][] inputs = {
                { "pay", "attention", "practice", "attend" },
                { "leetcode", "win", "loops", "success" } };
        String[] prefixes = { "at", "code" };

        for (int i = 0; i < inputs.length; i++) {
            int answer = s.prefixCount(inputs[i], prefixes[i]);
            System.out.println(answer);
        }
    }
}