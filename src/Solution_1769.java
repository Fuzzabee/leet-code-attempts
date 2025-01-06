import java.util.HashSet;

public class Solution_1769 {
    public int[] minOperations(String boxes) {
        // Initial Attempt O(n^2)
//        HashSet<Integer> ballIndices = new HashSet<>();
//        char[] splitBoxes = boxes.toCharArray();
//
//        for (int i = 0; i < splitBoxes.length; i++) {
//            if (splitBoxes[i] == '1') {
//                ballIndices.add(i);
//            }
//        }
//
//        int[] answer = new int[boxes.length()];
//
//        for (int i = 0; i < splitBoxes.length; i++) {
//            int curBox = 0;
//            for (int b : ballIndices) {
//                if (b == i) {
//                    continue;
//                }
//
//                curBox += Math.abs(i - b);
//            }
//            answer[i] = curBox;
//        }

        // More ideal attempt O(n)
        int boxesLength = boxes.length();
        int[] answer = new int[boxesLength];

        int ballsToLeft = 0;
        int movesToLeft = 0;
        int ballsToRight = 0;
        int movesToRight = 0;
        for (int i = 0; i < boxesLength; i++) {
            answer[i] += movesToLeft;
            ballsToLeft += Character.getNumericValue(boxes.charAt(i));
            movesToLeft += ballsToLeft;

            int j = boxesLength - 1 - i;
            answer[j] += movesToRight;
            ballsToRight += Character.getNumericValue(boxes.charAt(j));
            movesToRight += ballsToRight;
        }

        return answer;
    }
}
