import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter input: ");
        String s = in.nextLine();

        System.out.println("Enter pattern: ");
        String p = in.nextLine();

        Pattern pt = Pattern.compile(p);
        System.out.println("Output: " + pt.matches(p, s));
    }
}
