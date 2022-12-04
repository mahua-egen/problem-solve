public class Main {
    public static void main(String[] args) {
        int array[] = {3, 8, 9, 7, 6};
        int k = 3;
        cyclicRotation(array, k);
    }

    public static int[] cyclicRotation(int array[], int k) {
        int len = array.length;
        if (len == 0) {
            return array;
        }
        while (k > 0) {
            int temp = array[len - 1];
            for (int i = len - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
            k--;
        }
        return array;
    }
}
