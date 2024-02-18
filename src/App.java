import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Please insert the first number: ");
        num1 = input.nextInt();

        System.out.print("Please insert the 2nd number: ");
        num2 = input.nextInt();

        if(num1 > num2)
            displayMax(num1, num2);
        else if(num1 < num2)
            displayMax(num2, num1);
        else
            System.out.println("(＃°Д°)  [ The two numbers inserted are equal.]  (⊙_⊙)？");

    }

    public static void displayMax(int big, int small){
        System.out.printf("(ﾉ*･ω･)ﾉ     [ %d   >    %d. ]     \\(￣︶￣*\\))", big, small);
    }
}
