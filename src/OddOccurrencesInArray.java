import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int array[] = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(oddOccurrencesInArray(array));
    }

    public static int oddOccurrencesInArray(int array[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = array.length;
        for (int i = 0; i < len; i++) {
            Integer key = array[i];
            Integer count = map.get(key);
            if (count != null) {
                map.put(key, ++count);
            } else {
                map.put(key, 1);
            }
        }

        for (int i = 0; i < len; i++) {
            Integer count = map.get(array[i]);
            if (count%2 != 0) {
                return array[i];
            }
        }
        return 0;
    }
}
