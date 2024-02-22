import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number:");
        int secondNumber = scanner.nextInt();
        String art =   "K   K   SSSS   A  \n" +
                       "K  K   S      A A \n" +
                       "KKK    SSS   AAAAA\n" +
                       "K  K      S  A   A\n" +
                       "K   K  SSSS  A   A\n";
        if (firstNumber > secondNumber) {
            System.out.println(art + "The first number (" + firstNumber + ") is greater than the second number (" + secondNumber + ").");
        } else if (secondNumber > firstNumber) {
            System.out.println(art + "The second number (" + secondNumber + ") is greater than the first number (" + firstNumber + ").");
        } else {
            System.out.println(art + "The numbers are equal.");
        }
    }
}

