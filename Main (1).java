import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner number = new Scanner (System.in);
        System.out.println("please enter the first number:");
        int x =number.nextInt();
        System.out.println("please enter the second number:");
        int y=number.nextInt();
        if (x>y){
            System.out.println("The smallest nnumber is:"+x);
        }
        else if (x<y){
            System.out.println("The largest nnumber is:"+y) ;
        }
        else
        System.out.println("the numbers is equal.");
         


    } 

} 