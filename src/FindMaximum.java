import java.util.Scanner; 
 
class FindMaximum { 
    public static void main(String args[]) { 
        Scanner scanner = new Scanner(System.in); 
         
        System.out.println("Enter the first number: "); 
        int num1 = scanner.nextInt(); 
         
        System.out.println("Enter the second number: "); 
        int num2 = scanner.nextInt(); 
 
        if(num1 > num2) 
            System.out.println("Maximum is: " + num1); 
        else if(num2 > num1)  
            System.out.println("Maximum is: " + num2); 
        else 
            System.out.println(" They are equal "); 
             
 
        scanner.close();  
}  
}