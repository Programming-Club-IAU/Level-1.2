
import java.util.Scanner;

public class App {
      public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter  first number: ");
     int firstNum = scanner.nextInt();
    System.out.println("Enter second number: ");
   int secondNum=scanner.nextInt();
   scanner.close();
System.out.println("the first number=  "+firstNum+"  the second number= "+secondNum);
if (firstNum>secondNum) {
  System.out.println("the maximum is the first number ="+firstNum);
} else if (firstNum< secondNum) {
  System.out.println("the maxiemum is the second number= " +secondNum);
} else {
  System.out.println("the fist number equal the second number");
  System.out.println("  _____    A       M   M    _____ ");
  System.out.println(" / ____|   AA     MM  MM   |  ___|");
  System.out.println("| (___    A  A    MMMMMM   |___ ");
  System.out.println(" \\___\\   AAAAA    M M M M  |  ___|");
  System.out.println(" ____) | A     A  M     M  | |___ ");
  System.out.println("|_____/  A     A  M     M  |_____|");
 
               
    }
}
}