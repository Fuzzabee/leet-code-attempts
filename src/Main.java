public class Main {
    public static void main(String[] args) {
        Solution_1769 s = new Solution_1769();

        String[] inputs = { "110", "001011" };
        int[] answer;

        for (String test : inputs) {
            answer = s.minOperations(test);
            for (int i : answer) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}