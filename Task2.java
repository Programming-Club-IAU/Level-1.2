import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("******************************** let's Find the Maximum Number *******************************************");
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int max;
            if (num1 > num2) {
                max = num1;
            } else {
                max = num2;
            }
            System.out.println("***************************************** The Results *****************************************************");
            System.out.println("The maximum number is: " + max);
        }
    }

