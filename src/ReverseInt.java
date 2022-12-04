public class ReverseInt {
    public static void main(String[] args) {
        int input = 1534236469;
        System.out.println(reverseInt(input));
    }

    private static int reverseInt(int x) {
        try {
            String str = String.valueOf(x);
            if (x >= 0) {
                str = new StringBuilder(str).reverse().toString();
            } else {
                StringBuilder sb = new StringBuilder().append(str, 1, str.length()).reverse();
                str = new StringBuilder().append("-").append(sb).toString();
            }
            return Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
    }

}