import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("The first number is the greatest number:" + num1);

        } else if (num1 < num2) {
            System.out.println("The second number is the greatest number:" + num2);

        } else {
            System.out.println("The first number " + num1 + " is equal to the second number " + num2);
        }
    }
}
