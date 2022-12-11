public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {9, 3, 2, 3, 5, 7, 9};
        array = InsertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    // first part of array will be sorted
    // new element will be adjusted in sorted array
    public static int[] InsertionSort(int array[]) {
        int len = array.length;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (swap(array, i, j)) {
                    break;
                }
            }
        }
        return array;
    }

    public static boolean swap(int array[], int sort_index, int swap_index) {
        if (array[swap_index] > array[sort_index]) {
            int temp = array[sort_index];
            array[sort_index] = array[swap_index];
            array[swap_index] = temp;
            return true;
        }
        return false;
    }
}
