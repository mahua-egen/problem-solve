public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {9, 3, 2, 3, 5, 7, 9};
        array = SelectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    // search for lowest value in array
    // and set it in correct position
    public static int[] SelectionSort(int array[]) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            int temp = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i + 1; j < len; j++) {
                if (temp > array[j]) {
                    temp = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
