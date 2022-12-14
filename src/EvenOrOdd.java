public class EvenOrOdd {
    public static void main(String[] args) {
        int i = 1256789023;
        evenOrOdd1(i);
        evenOrOdd2(i);
        evenOrOdd3(i);
    }

    public static void evenOrOdd3(int i) {
        String num = Integer.toBinaryString(i);
        int j = num.charAt(num.length() - 1) - 48;
        if (j == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }

    public static void evenOrOdd2(int i) {
        String num = i + "";
        int j = num.charAt(num.length() - 1) - 48;
        if (j == 0 || j == 2 || j == 4 || j == 6 || j == 8)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void evenOrOdd1(int i) {
        while (i > 1) {
            i -= 2;
        }
        if (i == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
