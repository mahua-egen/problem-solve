import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] A = {1, 3, 1, 5, 2, 3, 7, 4};
        int X = 5;
        System.out.println(frogRiverOne(X, A));
    }

    public static int frogRiverOne(int X, int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.get(A[i]) == null) {
                map.put(A[i], i);
            }
        }
        int time = -1;
        for (int i = 1; i <= X; i++) {
            if (map.get(i) != null) {
                if (time < map.get(i)) {
                    time = map.get(i);
                }
            } else {
                time = -1;
                break;
            }
        }
        return time;
    }
}
