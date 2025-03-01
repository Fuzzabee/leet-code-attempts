public class Solution_1910 {
    public static void main(String[] args) {
        String[] s = { "daabcbaabcbc", "axxxxyyyyb" };
        String[] part = { "abc", "xy" };

        for (int i = 0; i < s.length; i++) {
            String output = removeOccurrences(s[i], part[i]);
            System.out.println(output);
        }
    }

    public static String removeOccurrences(String s, String part) {
////        System.out.println("Entered with " + s);
//        StringBuilder sb = new StringBuilder();
//
//        int partLength = part.length();
//        int curPartIndex = 0;
//        boolean partFound = false;
//        for (char c : s.toCharArray()) {
//            if (c == part.charAt(curPartIndex)) {
//                curPartIndex++;
//                if (curPartIndex == partLength) {
////                    System.out.println("Found " + part);
//                    partFound = true;
//                    curPartIndex = 0;
//                }
//            } else {
//                if (curPartIndex == 0) {
////                    System.out.printf("appending %c\n", c);
//                    sb.append(c);
//                } else {
//                    String toAdd = part.substring(0, curPartIndex);
////                    System.out.printf("appending from 0 to %d, '%s'\n", curPartIndex, toAdd);
//                    sb.append(part, 0, curPartIndex);
//                    curPartIndex = 0;
//                    if (c == part.charAt(curPartIndex)) {
//                        curPartIndex++;
//                        if (curPartIndex == partLength) {
////                            System.out.println("Found " + part);
//                            partFound = true;
//                            curPartIndex = 0;
//                        }
//                    }
//                }
//            }
//        }
//
//        if (curPartIndex != 0) {
//            sb.append(part, 0, curPartIndex);
//        }
//
//        if (partFound) {
//            return removeOccurrences(sb.toString(), part);
//        }
//
//        return sb.toString();
        if (!s.contains(part)) { return s; }

        return removeOccurrences(s.replaceFirst(part, ""), part);
    }
}
