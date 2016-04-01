import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by pc on 20.3.2016 г..
 */
public class _07_RandomizeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers on a separate line: ");

        Scanner console = new Scanner(System.in);
        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());

        if (firstNumber == secondNumber){
            System.out.println(firstNumber);
        } else{
            int min = Math.min(firstNumber, secondNumber);
            int max = Math.max(firstNumber, secondNumber);

            ArrayList<Integer> numbers = new ArrayList<>();

            for (int i = min; i <= max; i++) {
                numbers.add(i);
            }

            Collections.shuffle(numbers);

            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
