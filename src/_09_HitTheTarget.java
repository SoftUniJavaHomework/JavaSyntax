import java.util.Scanner;

/**
 * Created by pc on 20.3.2016 г..
 */
public class _09_HitTheTarget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int target = console.nextInt();

        for (int i = 1; i <= 20; i++) {
            int firstNumber = i;
            for (int j = 1; j <= 20; j++) {
                int secondNumber = j;

                if((firstNumber + secondNumber) == target) {
                    System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, target);
                } else if((firstNumber - secondNumber) == target) {
                    System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, target);
                }
            }
        }
    }
}
