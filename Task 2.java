import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the value for val_1: ");
    int val_1 = scanner.nextInt();

    System.out.print("Enter the value for val_2: ");
    int val_2 = scanner.nextInt();

    if (val_1 > val_2) {
      System.out.println("val_1 is greater than val_2");
    } else if (val_1 < val_2) {
      System.out.println("val_1 is less than val_2");
    } else {
      System.out.println("val_1 is equal to val_2");
    }

    scanner.close();
  }
}
