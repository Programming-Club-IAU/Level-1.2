import java.util.Scanner;

public class NDTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int n1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        System.out.println("Enter the second number:");
        int n2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        int max;
        
        if (n1 > n2) {
            max = n1;
        } else if (n2 > n1) {
            max = n2;
        } else {
            System.out.println("Both numbers are equal.");
            scanner.close();
            return;
        }
        
        System.out.println("The maximum of " + n1 + " and " + n2 + " is: " + max);
        
        scanner.close();
    }
}

