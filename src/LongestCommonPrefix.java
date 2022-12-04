public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        int lowest_length = 200;
        String lowest_str = "";
        for (String str : strs) {
            if (lowest_length > str.length()) {
                lowest_length = str.length();
                lowest_str = str;
            }
        }
        String[] prefixes = new String[lowest_length];

        for (int i = 0; i < lowest_length; i++) {
            prefixes[i] = new StringBuilder().append(lowest_str, 0, lowest_length - i).toString();
        }

        int flag = 0;
        for (int i = 0; i < prefixes.length; i++) {
            lowest_str = prefixes[i];
            for (String str : strs) {
                if (!str.startsWith(lowest_str)) {
                    flag = 0;
                    lowest_str="";
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        return lowest_str;
    }

}