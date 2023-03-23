public class CountDiv {
    public static void main(String[] args) {
        countDiv(6, 11, 2);
    }

    public static int countDiv(int A, int B, int K) {
        int div;
        int div1 = A / K;
        int mod1 = A % K;
        int div2 = B / K;
        if (mod1 == 0) {
            div = (div2 - div1) + 1;
        } else {
            div = div2 - div1;
        }
        return div;
    }
}
