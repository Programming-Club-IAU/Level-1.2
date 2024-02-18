/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;
import java.util.Scanner;
/**
 *
 * @author SOADAD
 */
public class Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input =new Scanner(System.in);
        System.out.println("///////  find maxiumum for two numbers  /////// ");
        System.out.println("Enter the first number :  ");
        x = input.nextInt();
        System.out.println("Enter the secoend number :  ");
        y=input.nextInt();
        if(x>y)
            System.out.println(x +" is greater than "+y);
        else if(y>x)
            System.out.println(y +" is greater than "+x);
        else
            System.out.println("the two numbers are equal to each other ");
    }
    
}
