import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
            
        }
        

        //POV: when I see java code: "Run with your life bro"
        System.out.println("    O   ");
        System.out.println("   /|\\/ ");
        System.out.println("   \\/\\   ");
        System.out.println("      /  ");

        System.out.println("    O   ");
        System.out.println("   /|\\/ ");
        System.out.println("   /\\   ");
        System.out.println("  /  |  ");
        
        sc.close();

    }
}
