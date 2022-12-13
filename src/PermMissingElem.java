public class PermMissingElem {
    public static void main(String[] args) {
        int array[] = {2, 3, 1, 5};
        System.out.println(permMissingElem(array));
    }

    public static int permMissingElem(int A[]) {
        double n = A.length + 1;
        double sum = n * (n + 1) / 2;
        double array_sum = 0.0;
        for (int i : A) {
            array_sum += i;
        }
        return (int) (sum - array_sum);
    }
}
