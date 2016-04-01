import java.util.Scanner;

/**
 * Created by pc on 20.3.2016 г..
 */
public class _01_RectangleArea {
    public static void main(String[] args) {
        System.out.println("Enter the sides of a rectangle separated by space:");

        Scanner console = new Scanner(System.in);
        String[]input = console.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        long area = a * b;
        System.out.println("The area is: " + area);
    }
}
