import java.util.Scanner;
/*
        System.out.println("(\\__/)");
        System.out.println("( 0.0)");
        System.out.println("/    >");
        System.out.println("v___v");

*/
public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y: ");
        double y = sc.nextDouble();
        if ( x > y ){
          System.out.println("(\\__/)");
          System.out.println("( 0.0)");
          System.out.println("/    > "+x +"(x) is bigger than " + y+"(y)") ;
        }
        else if (y > x){
          System.out.println("(\\__/)");
          System.out.println("( 0.0)");
          System.out.println("/    > "+y +"(y) is bigger than "+ x+"(x)");
        }
        else{
          System.out.println("(\\__/)");
          System.out.println("( -.-)");
          System.out.println("/    > Both x and y are equal..");

        }

    }
}

