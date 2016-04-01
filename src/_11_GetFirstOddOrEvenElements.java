import java.util.Scanner;

/**
 * Created by pc on 20.3.2016 г..
 */
public class _11_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter integers separated by space: ");
        String[] numbersAsString = console.nextLine().trim().split(" ");
        System.out.println("Enter a command(Get <number of elements> <odd/even>): ");
        String[] commandArgs = console.nextLine().trim().split(" ");

        int length = numbersAsString.length;
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        int numberOfElements = Integer.parseInt(commandArgs[1]);
        String oddOrEven = commandArgs[2];

        GetElements(numbers, oddOrEven, numberOfElements);
    }

    private static void GetElements(int[] numbers, String oddOrEven, int numberOfElements) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            if (count == numberOfElements){
                return;
            }

            if (oddOrEven.equals("even")){
                if (numbers[i] % 2 == 0){
                    System.out.print(numbers[i] + " ");
                    count++;
                }
            }else{
                if (numbers[i] % 2 != 0){
                    System.out.print(numbers[i] + " ");
                    count++;
                }
            }
        }
    }
}
