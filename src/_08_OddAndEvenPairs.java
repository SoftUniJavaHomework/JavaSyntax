import java.util.Random;
import java.util.Scanner;

public class _08_OddAndEvenPairs {
    public static void main(String[] args) {
        System.out.println("Enter integers on a single line");
        Scanner console = new Scanner(System.in);

        String[] numbersAsString = console.nextLine().split(" ");
        int length = numbersAsString.length;
        boolean isEven = CheckIfEven(length);

        if (!isEven){
            System.out.println("Invalid length");
        }else{
            int[] numbers= new int[length];
            for (int i =0; i< length ; i++) {
                numbers[i]=Integer.parseInt(numbersAsString[i]);
            }

            for (int i =0; i< length - 1; i+= 2) {
                int firstNumber = numbers[i];
                int secondNumber = numbers[i + 1];
                boolean isFirstNumberEven = CheckIfEven(firstNumber);
                boolean isSecondNumberEven = CheckIfEven(secondNumber);

                if (isFirstNumberEven ^ isSecondNumberEven){
                    System.out.printf("%d, %d -> different\n", firstNumber, secondNumber);
                }else{
                    String output = isFirstNumberEven & isSecondNumberEven ?
                        "both are even" : "both are odd";
                    System.out.printf("%d, %d -> %s\n", firstNumber, secondNumber, output);
                }
            }
        }
    }

    private static boolean CheckIfEven(int length) {
        boolean isEven= length % 2 == 0;
        return isEven;
    }
}
