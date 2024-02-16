import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int max = num2;

        System.out.println("********************************");
        if (num1 > num2) {
            max = num1;
        } else if (num1 == num2) {
            System.out.println("*       Numbers are equal.     *");
            System.out.println("********************************");
            return;
        }
        System.out.println("* The maximum number is: " + max + "   *");
        System.out.println("********************************");
    }
}