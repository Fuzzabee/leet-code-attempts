import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution_3223 sol = new Solution_3223();

        String[] s = {
                "abaacbcbb",
                "aa"
        };

        for (int i = 0; i < s.length; i++) {
            System.out.println(sol.minimumLength(s[i]));
        }
    }
}