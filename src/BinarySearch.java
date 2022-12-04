public class BinarySearch {
    public static void main(String[] args) {
        int[] sorted_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 45, 56, 77, 89, 90, 95, 100};
        int num = 80;
        System.out.println(binarySearch(sorted_array, num));
    }

    public static int binarySearch(int[] sorted_array, int num) {
        int min = 0;
        int max = sorted_array.length - 1;
        while (max >= min) {
            int guess = (max + min) / 2;
            if (sorted_array[guess] == num) {
                return guess;
            } else if (sorted_array[guess] < num) {
                min = guess + 1;
            } else if (sorted_array[guess] > num) {
                max = guess - 1;
            }
        }
        return -1;
    }
}
