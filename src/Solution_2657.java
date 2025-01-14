import java.util.HashSet;

public class Solution_2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int size = A.length;
        int[] result = new int[size];
        HashSet<Integer> found = new HashSet<>();
        int counter = 0;
        boolean b;

        for (int i = 0; i < size; i++) {
            b = found.add(A[i]);
            if (!b) {
                ++counter;
            }

            b = found.add(B[i]);
            if (!b) {
                ++counter;
            }

            result[i] = counter;
        }

        return result;
    }
}
