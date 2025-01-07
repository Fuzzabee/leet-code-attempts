import java.util.ArrayList;
import java.util.List;

class Solution_1408 {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> answer = new ArrayList<>();

        for (String word1 : words) {
            for (String word2 : words) {
                if (word1.length() >= word2.length()) {
                    continue;
                }
                if (word2.contains(word1)) {
                    answer.add(word1);
                    break;
                }
            }
        }

        return answer;
    }
    
    public boolean kmp(String word1, String word2) {
        return false;
    }
}