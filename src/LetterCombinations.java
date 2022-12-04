import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        String digits = "234";
        System.out.println(letterCombinations(digits));
    }

    private static List<String> letterCombinations(String digits) {
        int len = digits.length();
        if (len == 1) {
            return mapping(digits.charAt(0));
        }

        List<String> temp_combination = new ArrayList<>();
        int temp_len = 0;
        List<String> result_combination = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            char c = digits.charAt(i);
            List<String> next_combination = mapping(c);
            if (temp_combination.size() == 0) {
                for (int j = 0; j < next_combination.size(); j++) {
                    temp_combination.add(next_combination.get(j));
                }
                temp_len = temp_combination.size();
            } else {
                for (int j = 0; j < temp_len; j++) {
                    String str = temp_combination.get(j);
                    for (int k = 0; k < next_combination.size(); k++) {
                        String r = str.concat(next_combination.get(k));
                        if (r.length() == len) {
                            result_combination.add(r);
                        } else {
                            temp_combination.add(r);
                        }
                    }
                }
                temp_len = temp_combination.size();
            }
        }
        return result_combination;
    }

    private static List<String> mapping(char c) {
        if (c == '2') {
            return List.of("a", "b", "c");
        } else if (c == '3') {
            return List.of("d", "e", "f");
        } else if (c == '4') {
            return List.of("g", "h", "i");
        } else if (c == '5') {
            return List.of("j", "k", "l");
        } else if (c == '6') {
            return List.of("m", "n", "o");
        } else if (c == '7') {
            return List.of("p", "q", "r", "s");
        } else if (c == '8') {
            return List.of("t", "u", "v");
        } else if (c == '9') {
            return List.of("w", "x", "y", "z");
        } else {
            return List.of();
        }
    }
}