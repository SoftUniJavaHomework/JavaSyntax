import java.util.Scanner;

/**
 * Created by pc on 20.3.2016 г..
 */
public class _05_DecimalToBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int decimal = console.nextInt();

        System.out.println(Integer.toString(decimal, 7));
    }
}
