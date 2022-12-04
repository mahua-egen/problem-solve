import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

//        int[] nums = {-3, 4, 3, 90};
//        int target = 0;
//        int[] nums = {0, 4, 3, 0};
//        int target = 0;
//        int[] nums = {3, 2, 4};
//        int target = 6;
//        int[] nums = {3, 2, 3};
//        int target = 6;
//        int[] nums = {2, 5, 5, 11};
//        int target = 10;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 19;
        int[] result = indices(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    private static int[] indices(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> indexList = map.get(nums[i]);
            if (indexList == null) {
                indexList = new ArrayList<>();
            }
            indexList.add(i);
            map.put(nums[i], indexList);
        }

        int i = 0;
        int first = nums[i];
        List<Integer> index1;
        List<Integer> index2;
        while (i < nums.length) {
            int second = target - first;
            index1 = map.get(first);
            index2 = map.get(second);
            if (index1 != null && index2 != null && index1 == index2 && index1.size() > 1) {
                result[0] = index1.get(0);
                result[1] = index1.get(1);
                return result;
            } else if (index1 != null && index2 != null && index1 != index2) {
                if (index1.get(0) < index2.get(0)) {
                    result[0] = index1.get(0);
                    result[1] = index2.get(0);
                    return result;
                } else if (index1.get(0) > index2.get(0)) {
                    result[0] = index2.get(0);
                    result[1] = index1.get(0);
                    return result;
                }
            } else {
                i++;
                first = nums[i];
            }
        }
        return result;
    }
}