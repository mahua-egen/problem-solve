import java.util.ArrayList;
import java.util.List;

public class PassingCars {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        passingCars(A);
    }

    public static int passingCars(int[] A) {
        Integer len = A.length;
        if (len > 100000) {
            return -1;
        }
        List<Integer> zerosIndex = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zerosIndex.add(i);
            }
        }
        Integer zerosLen = zerosIndex.size();
        Integer j = 1;
        Integer count = 0;
        for (Integer i : zerosIndex) {
            count = count + (len - (i + 1) - (zerosLen - j));
            j++;
        }
        if (count < 0) {
            return -1;
        }
        if (count > 1000000000) {
            return -1;
        }
        return count;
    }
}
