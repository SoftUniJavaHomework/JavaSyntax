import java.util.Scanner;

/**
 * Created by pc on 20.3.2016 г..
 */
public class _06_Base7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        String number = console.next();
        int decimal = Integer.valueOf(number, 7);

        System.out.println(decimal);
    }
}
