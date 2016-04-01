import java.util.Scanner;

/**
 * Created by pc on 20.3.2016 г..
 */
public class _10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter 2 strings separataed by space: ");
        String[] strings = console.nextLine().split(" ");

        String firstWord = strings[0].length() >= strings[1].length() ? strings[0] : strings[1];
        String secondWord = strings[1].length() <= strings[0].length() ? strings[1] : strings[0];

        long charSum = calculateCharSum(firstWord, secondWord);
        System.out.println(charSum);
    }

    private static long calculateCharSum(String firstWord, String secondWord) {
        long sum = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            if (i < secondWord.length()) {
                sum += (firstWord.charAt(i) * secondWord.charAt(i));
            } else {
                sum += firstWord.charAt(i);
            }
        }

        return sum;
    }
}
