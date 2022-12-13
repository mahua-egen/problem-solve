public class SummationWithSeries {
    public static void main(String[] args) {
        int array[] = {2, 3, 1, 5};
        System.out.println(summationWithSeries(array));
    }

    public static int summationWithSeries(int A[]) {
        double n = A.length + 1;
        double sum = n * (n + 1) / 2;
        return (int) sum;
    }
}
