import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstnum = num.nextInt();

        System.out.println("Please enter the second number: ");
        int secondnum = num.nextInt();

        if (firstnum > secondnum) {
            System.out.println(firstnum+" is bigger than "+secondnum);
        }
        else if (secondnum > firstnum) {
            System.out.println(secondnum+" is bigger than "+firstnum);
        }
        else{
            System.out.println(firstnum+" and "+secondnum+" are equal.");
        }
    }
}
