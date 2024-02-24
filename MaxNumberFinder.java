import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The larger number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("The larger number is: " + secondNumber);
        } else {
            System.out.println("Both numbers are equal.");
        }

        System.out.println("\n"
            + "     /-_-\\\n"
            + "    / / \\\\\n"
            + "    \\\\ \\ /\n"
            + "     \\_\\_/\n"
            + "      `-`\n");

            scanner.close(); 

    }
}
