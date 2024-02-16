import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = myObj.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = myObj.nextInt();

        System.out.println();

        if (num1 > num2) {
            System.out.println("The first number (" + num1 + ") is greater than the second number");
        }
        else if (num1 < num2) {
            System.out.println("The second number (" + num2 + ") is greater than the first number");
        }
        else {
            System.out.println("They are equal!");
        }
    }
}
