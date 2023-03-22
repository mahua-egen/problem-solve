import java.util.HashMap;
import java.util.Map;

public class MissingInteger {
    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};
        missingInteger(A);
    }

    public static int missingInteger(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            map.put(i, i);
        }
        for (int i = 1; i < 1000000; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return 1000001;
    }
}
