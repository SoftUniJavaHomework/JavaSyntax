import java.util.Scanner;

/**
 * Created by pc on 20.3.2016 г..
 */
public class _03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an integer a (0 <= a <= 500): ");
        int a = console.nextInt();

        System.out.print("Enter a floating-point number b: ");
        double b = console.nextDouble();

        System.out.print("Enter a floating-point number c: ");
        double c = console.nextDouble();

        String binary = Integer.toBinaryString(a);
        int intBinary = Integer.parseInt(binary);

        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, intBinary, b, c);
    }
}
