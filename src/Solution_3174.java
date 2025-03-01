public class Solution_3174 {
    public static void main (String[] args) {
        String[] input = { "abc", "cb34", "a8f" };

        for (String s : input) {
            String output = clearDigits(s);
            System.out.println(output);
        }
    }

    public static String clearDigits(String s) {
        int numDigits = countDigits(s);
        if (numDigits == 0) {
            return s;
        }

        char[] split = s.toCharArray();
        int alphaRemaining = numDigits;
        int numRemaining = numDigits;
        int numDigitsEncountered = 0;
        for (int i = split.length - 1; i >= 0; i--) {
            if (numDigitsEncountered > 0 && Character.isAlphabetic(split[i]) && alphaRemaining > 0) {
                split[i] = '!';
                alphaRemaining--;
                numDigitsEncountered--;
                continue;
            }

            if (Character.isDigit(split[i]) && numRemaining > 0) {
                split[i] = '!';
                numDigitsEncountered++;
                numRemaining--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : split) {
            if (c != '!') {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static int countDigits(String s) {
        char[] split = s.toCharArray();
        int numDigits = 0;

        for (char c : split) {
            if (Character.isDigit(c)) {
                numDigits++;
            }
        }

        return numDigits;
    }
}
