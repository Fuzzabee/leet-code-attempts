import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_1408 s = new Solution_1408();

        String[][] inputs = {
                { "mass", "as", "hero", "superhero" },
                { "leetcode", "et", "code" },
                { "blue", "green", "bu" }};
        List<String> answer;

        for (String[] test : inputs) {
            answer = s.stringMatching(test);
            for (String i : answer) {
                System.out.printf("%s ", i);
            }

            System.out.println();
        }
    }
}