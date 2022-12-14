public class TapeEquilibrium {
    public static void main(String[] args) {
        int A[] = {3, 1, 2, 4, 3};
        System.out.println(TapeEquilibrium(A));
    }

    public static int TapeEquilibrium(int A[]) {
        int len = A.length;
        double div = Integer.MAX_VALUE;
        double[] dd = new double[len];
        dd[0] = A[0];
        for (int i = 1; i < len; i++) {
            dd[i] = dd[i - 1] + A[i];
        }
        double temp = dd[len - 1];
        for (int i = 0; i < len - 1; i++) {
            temp = temp - A[i];
            double abs = Math.abs(dd[i] - temp);
            if (div > abs) {
                div = abs;
            }
        }
        return (int) div;
    }
}
