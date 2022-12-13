public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {9, 10, 3, 2, 3, 5, 1, 7, 9};
        array = insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // first part of array will be sorted
    // new element will be adjusted in sorted array
    public static int[] insertionSort(int array[]) {
        int len = array.length;
        for (int i = 1; i < len; i++) {
            int value = array[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > value) {
                    int temp = array[j];
                    array[j] = value;
                    array[index] = temp;
                    index = j;
                }
            }
        }
        return array;
    }
}
