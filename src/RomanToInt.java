public class RomanToInt {
    public static void main(String[] args) {
//        String s = "MCMXCIV";
//        String s = "LVIII";
//        String s = "III";
        String s = "DCXXI";
//        System.out.println(romanToInt13(s));
//        System.out.println(romanToInt132(s));
//        System.out.println(romanToInt133(s));
        System.out.println(romanToInt14(s));

    }

    public static int romanToInt14(String s) {
        int len = s.length();
        int sum = 0;
        int k;
        for (int i = 0; i < len; i++) {
            int flag = 0;
            k = i + 1;
            char c = s.charAt(i);
            if (k < len) {
                char d = s.charAt(k);
                if ((c == 'I' && d == 'V') || (c == 'I' && d == 'X')) {
                    sum = sum + mapping15(c, d);
                    i++;
                    flag = 1;
                } else if ((c == 'X' && d == 'L') || (c == 'X' && d == 'C')) {
                    sum = sum + mapping15(c, d);
                    i++;
                    flag = 1;
                } else if ((c == 'C' && d == 'D') || (c == 'C' && d == 'M')) {
                    sum = sum + mapping15(c, d);
                    i++;
                    flag = 1;
                }
            }
            if (flag == 0) {
                sum = sum + mapping14(c);
            }
        }
        return sum;
    }

    private static int mapping15(char c, char d) {
        if (c == 'I' && d == 'V') {
            return 4;
        } else if (c == 'I' && d == 'X') {
            return 9;
        } else if (c == 'X' && d == 'L') {
            return 40;
        } else if (c == 'X' && d == 'C') {
            return 90;
        } else if (c == 'C' && d == 'D') {
            return 400;
        } else if (c == 'C' && d == 'M') {
            return 900;
        }
        return 0;
    }

    private static int mapping14(char c) {
        if (c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'D') {
            return 500;
        } else if (c == 'M') {
            return 1000;
        }
        return 0;
    }

//    private static int romanToInt133(String s) {
//        int len = s.length();
//        int sum = 0;
//        String replace = "AA";
//        String m1 = "IV";
//        String m2 = "IX";
//        String m3 = "XL";
//        String m4 = "XC";
//        String m5 = "CD";
//        String m6 = "CM";
//
//
//        if (s.contains(m1)) {
//            sum = sum + mapping(m1);
//            s = s.replaceFirst(m1, replace);
//
//        }
//
//        if (s.contains(m2)) {
//            sum = sum + mapping(m2);
//            s = s.replaceFirst(m2, replace);
//
//        }
//
//        if (s.contains(m3)) {
//            sum = sum + mapping(m3);
//            s = s.replaceFirst(m3, replace);
//
//        }
//
//        if (s.contains(m4)) {
//            sum = sum + mapping(m4);
//            s = s.replaceFirst(m4, replace);
//
//        }
//
//        if (s.contains(m5)) {
//            sum = sum + mapping(m5);
//            s = s.replaceFirst(m5, replace);
//
//        }
//
//        if (s.contains(m6)) {
//            sum = sum + mapping(m6);
//            s = s.replaceFirst(m6, replace);
//
//        }
//
//        for (int i = 0; i < len; i++) {
//            String c = s.substring(i, i + 1);
//            sum = sum + mapping(c);
//        }
//
//        return sum;
//    }
//
//    private static int romanToInt132(String s) {
//        int len = s.length();
//        int sum = 0;
//        String replace = "AA";
//        String m1 = "IV";
//        String m2 = "IX";
//        String m3 = "XL";
//        String m4 = "XC";
//        String m5 = "CD";
//        String m6 = "CM";
//
//        int count = s.split(m1, -1).length - 1;
//        sum = sum + mapping(m1) * count;
//        s = s.replaceAll(m1, replace);
//
//
//        count = s.split(m2, -1).length - 1;
//        sum = sum + mapping(m2) * count;
//        s = s.replaceAll(m2, replace);
//
//        count = s.split(m3, -1).length - 1;
//        sum = sum + mapping(m3) * count;
//        s = s.replaceAll(m3, replace);
//
//
//        count = s.split(m4, -1).length - 1;
//        sum = sum + mapping(m4) * count;
//        s = s.replaceAll(m4, replace);
//
//
//        count = s.split(m5, -1).length - 1;
//        sum = sum + mapping(m5) * count;
//        s = s.replaceAll(m5, replace);
//
//
//        count = s.split(m6, -1).length - 1;
//        sum = sum + mapping(m6) * count;
//        s = s.replaceAll(m6, replace);
//
//
//        for (int i = 0; i < len; i++) {
//            String c = s.substring(i, i + 1);
//            sum = sum + mapping(c);
//        }
//
//        return sum;
//    }

    private static int romanToInt13(String s) {
        int len = s.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int flag = 0;
            int j = i + 1;
            int k = i + 2;
            StringBuilder c = new StringBuilder();
            StringBuilder n = new StringBuilder();
            c.append(s, i, j);
            if (c.toString().equals("I")) {
                if (j < len && k <= len) {
                    n.append(s, j, k);
                    if (n.toString().equals("V") || n.toString().equals("X")) {
                        sum = sum + mapping(c.append(n));
                        i++;
                        flag = 1;
                    }
                }
            } else if (c.toString().equals("X")) {
                if (j < len && k <= len) {
                    n.append(s, j, k);
                    if (n.toString().equals("L") || n.toString().equals("C")) {
                        sum = sum + mapping(c.append(n));
                        i++;
                        flag = 1;
                    }
                }
            } else if (c.toString().equals("C")) {
                if (j < len && k <= len) {
                    n.append(s, j, k);
                    if (n.toString().equals("D") || n.toString().equals("M")) {
                        sum = sum + mapping(c.append(n));
                        i++;
                        flag = 1;
                    }
                }
            }
            if (flag == 0) {
                sum = sum + mapping(c);
            }
        }
        return sum;
    }

    private static int mapping(StringBuilder c) {
        if (c.toString().equals("I")) {
            return 1;
        } else if (c.toString().equals("IV")) {
            return 4;
        } else if (c.toString().equals("V")) {
            return 5;
        } else if (c.toString().equals("IX")) {
            return 9;
        } else if (c.toString().equals("X")) {
            return 10;
        } else if (c.toString().equals("XL")) {
            return 40;
        } else if (c.toString().equals("L")) {
            return 50;
        } else if (c.toString().equals("XC")) {
            return 90;
        } else if (c.toString().equals("C")) {
            return 100;
        } else if (c.toString().equals("CD")) {
            return 400;
        } else if (c.toString().equals("D")) {
            return 500;
        } else if (c.toString().equals("CM")) {
            return 900;
        } else if (c.toString().equals("M")) {
            return 1000;
        }
        return 0;
    }


    public int romanToInt(String s) {
        int len = s.length();
        int sum = 0;
        String c;
        String n;
        for (int i = 0; i < len; i++) {
            int flag = 0;
            int j = i + 1;
            int k = i + 2;
            c = s.substring(i, j);
            if (c.equals("I")) {
                if (j < len && k <= len) {
                    n = s.substring(j, k);
                    if (n.equals("V") || n.equals("X")) {
                        sum = sum + mapping(c.concat(n));
                        i++;
                        flag = 1;
                    }
                }
            } else if (c.equals("X")) {
                if (j < len && k <= len) {
                    n = s.substring(j, k);
                    if (n.equals("L") || n.equals("C")) {
                        sum = sum + mapping(c.concat(n));
                        i++;
                        flag = 1;
                    }
                }
            } else if (c.equals("C")) {
                if (j < len && k <= len) {
                    n = s.substring(j, k);
                    if (n.equals("D") || n.equals("M")) {
                        sum = sum + mapping(c.concat(n));
                        i++;
                        flag = 1;
                    }
                }
            }
            if (flag == 0) {
                sum = sum + mapping(c);
            }
        }
        return sum;
    }

    private static int mapping(String c) {
        if (c.equals("I")) {
            return 1;
        } else if (c.equals("IV")) {
            return 4;
        } else if (c.equals("V")) {
            return 5;
        } else if (c.equals("IX")) {
            return 9;
        } else if (c.equals("X")) {
            return 10;
        } else if (c.equals("XL")) {
            return 40;
        } else if (c.equals("L")) {
            return 50;
        } else if (c.equals("XC")) {
            return 90;
        } else if (c.equals("C")) {
            return 100;
        } else if (c.equals("CD")) {
            return 400;
        } else if (c.equals("D")) {
            return 500;
        } else if (c.equals("CM")) {
            return 900;
        } else if (c.equals("M")) {
            return 1000;
        }
        return 0;
    }
}
