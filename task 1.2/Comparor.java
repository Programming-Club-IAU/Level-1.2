//package tester;

import java.util.Scanner;

public class Comparor{
public static void main(String[] args) {
    int x = 0;
    int y = 0;
    Scanner cin = new Scanner(System.in);

    System.out.println("Please enter two numbers to be compared...");
    System.out.println("the first number: ");
    x = cin.nextInt();
    System.out.println("the second number: ");
    y = cin.nextInt();

    compare_of_two_numbers(x , y);
}

 static void compare_of_two_numbers(double num1, double num2){
    
    

    if(num1 > num2){ System.out.println("the bigger number is: " + num1);}
    else if(num1 == num2){System.out.println("both of the number you entered are equal." )  ; }
    else{ System.out.println("the bigger number is: " + num2);}
    
}

}