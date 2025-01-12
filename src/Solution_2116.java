public class Solution_2116 {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 == 1) {
            return false;
        }

        if (locked.charAt(0) == '1' && s.charAt(0) == ')') {
            return false;
        }

        if (locked.charAt(s.length() - 1) == '1' && s.charAt(s.length() - 1) == '(') {
            return false;
        }

        int unlockedCount = 0;
        int openingCount = 0;
        int closingCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == '(') {
                    openingCount++;
                } else {
                    closingCount++;
                }
            } else {
                unlockedCount++;
            }

            if (unlockedCount < (closingCount - openingCount)) {
                return false;
            }
        }

        unlockedCount = 0;
        openingCount = 0;
        closingCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == '(') {
                    openingCount++;
                } else {
                    closingCount++;
                }
            } else {
                unlockedCount++;
            }

            if (unlockedCount < (openingCount - closingCount)) {
                return false;
            }
        }

        return true;
    }
}
