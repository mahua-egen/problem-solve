public class Palindrome {
    public static void main(String[] args) {
        int input = 124521;
        System.out.println(palindrome(input));
    }

    private static boolean palindrome(int x) {
        if (x < 0) return false;

        int[] b = new int[Integer.toString(x).length()];
        int k = 0;
        while (x != 0) {
            b[k++] = x % 10;
            x = x / 10;
        }

        int loop_index = k / 2;
        while (x < loop_index) {
            if (b[x++] != b[--k]) {
                return false;
            }
        }

        return true;
    }
}