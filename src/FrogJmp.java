public class FrogJmp {
    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;
        System.out.println(frogJmp(X, Y, D));
    }

    public static int frogJmp(int X, int Y, int D) {
        if (X == Y)
            return 0;
        int input = Y-X;
        int div = input / D;
        int mod = input % D;
        if (mod > 0) {
            return div + 1;
        } else {
            return div;
        }
    }
}
