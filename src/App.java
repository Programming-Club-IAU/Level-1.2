import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        if (number1 > number2){
            System.out.println("Maximum: " + number1);
        } else if (number2 > number1){
            System.out.println("Maximum: " + number2);
        } else{
            System.out.println(number1 + "and " + number2 + " are equal");
        }
        System.out.println("          /\\_/\\");
        System.out.println("         ( o.o )");
        System.out.println("          > ^ <");
        System.out.println(" Thank You for using my program!");
    }
}
