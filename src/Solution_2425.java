import java.util.HashMap;

public class Solution_2425 {
    public int xorAllNums(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int len1 = nums1.length;
        int len2 = nums2.length;

        for (int n : nums1) {
            if (freqMap.containsKey(n)) {
                freqMap.put(n, freqMap.get(n) + len2);
            } else {
                freqMap.put(n, len2);
            }
        }

        for (int n : nums2) {
            if (freqMap.containsKey(n)) {
                freqMap.put(n, freqMap.get(n) + len1);
            } else {
                freqMap.put(n, len1);
            }
        }

        int result = 0;
        for (int n : freqMap.keySet()) {
            int freq = freqMap.get(n);
            if (freq % 2 != 0) {
                result = result ^ n;
            }
        }

        return result;
    }
}
