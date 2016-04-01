import java.util.Scanner;

/**
 * Created by pc on 20.3.2016 г..
 */
public class _04_CalculateExpression {
    public static void main(String[] args) {
        System.out.println("Enter 3 floating-point numbers on a separate line: ");

        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double power = (a + b + c) / Math.sqrt(c);
        double resultF1 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)) /
                (Math.pow(a, 2) - Math.pow(b, 2)), power);

        double resultF2 = Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3), (a - b));

        double average= (a + b + c) / 3;
        double formulasAverage = (resultF1 + resultF2) / 2;
        double diff = Math.abs(average - formulasAverage);

        System.out.printf(
                "F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f",
                resultF1,
                resultF2,
                diff);
    }
}
