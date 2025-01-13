import java.util.HashMap;

public class Solution_3223 {
    public int minimumLength(String s) {
        if (s.length() < 3) {
            return s.length();
        }

        int minimumSize = 0;
//        HashMap<Character, Integer> letterFrequency = new HashMap<>();
        int[] frequency = new int[26];

        for (char c : s.toCharArray()) {
            int i = c - 97;
            frequency[i] = frequency[i] + 1;
        }

        for (int n : frequency) {
            if (n > 2) {
                if (n % 2 == 0) {
                    minimumSize += 2;
                } else {
                    minimumSize += 1;
                }
            } else {
                minimumSize += n;
            }
        }

        return minimumSize;
    }
}
