import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int Num1 = num1.nextInt();

        System.out.println("Enter the second number: ");
        int Num2 = num2.nextInt();

        if (Num1>Num2){
            System.out.println("The first number is greater than the second");
        }
        else if(Num2>Num1){
            System.out.println("The second number is greater than the first");
        }
        else{
            System.out.println("The numbers are equal");
        }
    }
}