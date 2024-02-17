import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ( x > y )
          System.out.println(x +" is bigger than " + y) ;
        else if (y > x)
          System.out.println(y +" is bigger than "+ x);
        else 
          System.out.println("Both x and y are equal");
        


      System.out.println();
    }
}

