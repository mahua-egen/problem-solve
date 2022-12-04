import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5};

        int a_len = nums1.length;
        int b_len = nums2.length;
        int c_len = a_len + b_len;
        int[] c = new int[c_len];

        for (int i = 0; i < a_len; i++) {
            c[i] = nums1[i];
        }
        for (int i = 0; i < b_len; i++) {
            c[a_len + i] = nums2[i];
        }
        Arrays.sort(c);
        int median_pos = c_len / 2;
        double median = 0;
        if (c_len % 2 != 0) {
            median = c[median_pos];
        } else {
            median = (double) (c[median_pos-1] + c[median_pos]) / 2;
        }

        System.out.println("Output: " + median);
    }
}
