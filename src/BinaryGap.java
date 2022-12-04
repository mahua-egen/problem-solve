import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    public static void main(String[] args) {
        int num = 1041;
        System.out.println(binaryGap(num));
    }

    public static int binaryGap(int num) {
        List<Integer> array = new ArrayList<>();
        int gap = 0;
        int max = 0;
        int index = 0;
        while (num > 0) {
            int mod = num % 2;
            if (mod == 0) {
                gap++;
            } else {
                if (gap > max) {
                    int ch = index - gap - 1;
                    if (ch > -1 && array.get(index - gap - 1) == 1) {
                        max = gap;
                    }
                }
                gap = 0;
            }
            array.add(mod);
            num = num / 2;
            index++;
        }
        return max;
    }
}
