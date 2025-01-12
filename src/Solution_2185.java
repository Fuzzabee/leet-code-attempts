public class Solution_2185 {
    public int prefixCount(String[] words, String pref) {
        int answer = 0;

        for (String w : words) {
            if (w.startsWith(pref)) {
                answer++;
            }
        }

        return answer;
    }
}
