import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static void main(String[] args) {
        double[] A = {4, 1, 3, 2};
        System.out.println(permCheck(A));
    }

    public static int permCheck(double[] A) {
        Set<Double> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            double j = A[i];
            if (!set.add(j)) {
                return 0;
            }
        }
        for (int i = 0; i < A.length; i++) {
            double j = i + 1;
            if (!set.contains(j)) {
                return 0;
            }
        }
        return 1;
    }
}
