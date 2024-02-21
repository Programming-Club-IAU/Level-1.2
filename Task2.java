import java.util.Scanner; 
public class Task2 {
  public static void main(String[] args) {
    Scanner Userinput = new Scanner(System.in);
    System.out.println("Enter First number: ");
    int num1= Userinput.nextInt();
    System.out.println("Enter  second number: ");
    int num2= Userinput.nextInt();

    if (num1 > num2 ){
        System.out.println("num1 is greater");
    }

    else if ( num2 > num1 ){
        System.out.println("num2 is greater");
    }

    else {
      System.out.println("Both numbers are equal");
    
    }
    

  }
}
