public class SwapWithoutTemp {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println("input i=" + i + " j=" + j);
        swap(i, j);
    }

    public static void swap(int i, int j) {
        j = j + i;
        i = j - i;
        j = j - i;
        System.out.println("output i=" + i + " j=" + j);
    }
}
