import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};
        System.out.println(permCheck(A));
    }

    public static int permCheck(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < A.length; i++) {
            if (!set.add(A[i])) {
                return 0;
            }
        }
        for (int i = 1; i < A.length; i++) {
            if (!set.contains(i)) {
                return 0;
            }
        }
        return 1;
    }
}
