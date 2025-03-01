import java.util.HashMap;

public class Solution_1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        HashMap<Character, Integer> s1Differences = new HashMap<>();
        HashMap<Character, Integer> s2Differences = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
//            System.out.printf("s1 = %c, s2 = %c\n", s1.charAt(i), s2.charAt(i));
            if (s1.charAt(i) != s2.charAt(i)) {
                s1Differences.put(s1.charAt(i), s1Differences.getOrDefault(s1.charAt(i), 0) + 1);
                s2Differences.put(s2.charAt(i), s2Differences.getOrDefault(s2.charAt(i), 0) + 1);
            }
        }

        // Check to ensure size == 2, keysets are ==, all values == 1
        if (s1Differences.size() == 2 || s1Differences.isEmpty()) {
            for (int n : s1Differences.values()) {
                if (n != 1) { return false; }
            }
            return true;
        }

        return false;
    }
}
