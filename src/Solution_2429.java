public class Solution_2429 {
    public int minimizeXor(int num1, int num2) {
        char[] num1Bin = Integer.toBinaryString(num1).toCharArray();

        int num1SetBits = Integer.bitCount(num1);
        int num2SetBits = Integer.bitCount(num2);

        if (num1SetBits == num2SetBits) {
            return num1;
        }

        if (num1SetBits > num2SetBits) {
            char[] newNum = new char[num1Bin.length];
            int numFilled = 0;
            for (int i = 0; i < newNum.length; i++) {
                if (num1Bin[i] == '1' && numFilled < num2SetBits) {
                    newNum[i] = '1';
                    numFilled++;
                } else {
                    newNum[i] = '0';
                }
            }
            return Integer.parseInt(String.valueOf(newNum), 2);
        }

        int numZeroes = num1Bin.length - num1SetBits;
        int size = num1Bin.length + Integer.max(0, num2SetBits - numZeroes);
        char[] newNum = new char[size];
        for (int i = 0; i < size - num1Bin.length; i++) {
            newNum[i] = '0';
        }

        for (int i = 0; i < num1Bin.length; i++) {
            newNum[i + (size - num1Bin.length)] = num1Bin[i] == '1' ? '1' : '0';
        }

        int remaining = num2SetBits - num1SetBits;
        int i = newNum.length - 1;
        while (remaining > 0) {
            if (newNum[i] == '0') {
                newNum[i] = '1';
                remaining--;
            }
            i--;
        }
        return Integer.parseInt(String.valueOf(newNum), 2);
    }
}
