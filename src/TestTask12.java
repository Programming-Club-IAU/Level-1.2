
import java.util.Scanner;

public class TestTask12 {

    public static void main(String[] args) throws Exception {
        int num1, num2, max;

        System.out.println("******************************************\n");
        System.out.println("***           Find The Maximum          ***\n");
        System.out.println("******************************************\n");
        System.out.println("   +---------------------------------+   \n");
        System.out.println("   |                                 |   \n");
        System.out.println("   |     Enter the First Number:     |   \n");
        System.out.println("   |                                 |   \n");
        System.out.println("   +---------------------------------+   \n");

        Scanner Input = new Scanner(System.in);
        if (Input.hasNextInt()) {
            num1 = Input.nextInt();
        } else {
            Input.next(); // discard invalid input
            System.out.println("Invalid Input. Please Enter an Integer Number.\n");
            return;
        }

        System.out.println("   +---------------------------------+   \n");
        System.out.println("   |                                 |   \n");
        System.out.println("   |                                 |   \n");
        System.out.println("   |     Enter the Second Number:    |   \n");
        System.out.println("   |                                 |   \n");
        System.out.println("   +---------------------------------+   \n");

        if (Input.hasNextInt()) {
            num2 = Input.nextInt();
        } else {
            Input.next(); // discard invalid input
            System.out.println("Invalid Input. Please Enter an Integer Number.\n");
            return;
        }

        System.out.println("   +---------------------------------+   \n");

        if (num1 > num2) {
            max = num1;

            System.out.println("   +---------------------------------+   \n");
            System.out.println("   |                                 |   \n");
            System.out.println("   |  The Maximum of Two Number is:  |   \n");
            System.out.println("   |           "+max+"               |   \n");
            System.out.println("   |                                 |   \n");
            System.out.println("   +---------------------------------+   \n");
            System.out.println("   |                                 |   \n");
            System.out.println("   |  Because " + num1 + " is greater|   \n");
            System.out.println("   |  than " + num2 + ".             |   \n");
            System.out.println("   |                                 |   \n");
            System.out.println("   +---------------------------------+   \n");
        } else if (num1 < num2) {
            max = num2;

            System.out.println("   +---------------------------------+   \n");
            System.out.println("   |                                 |   \n");
            System.out.println("   |  The Maximum of Two Number is:  |   \n");
            System.out.println("   |           "+max+"               |   \n");
            System.out.println("   |                                 |   \n");
            System.out.println("   +---------------------------------+   \n");
            System.out.println("   |                                 |   \n");
            System.out.println("   |  Because " + num1 + " is less   |   \n");
            System.out.println("   |  than " + num2 + ".             |   \n");
            System.out.println("   |                                 |   \n");
            System.out.println("   +---------------------------------+   \n");
        } else {
            System.out.println("   +---------------------------------+   \n");
            System.out.println("   |                                 |   \n");
            System.out.println("   |  The Maximum of Two Number Not  |   \n");
            System.out.println("   |  Not Found! Because "+num1+" is |   \n");
            System.out.println("   |  Equal to "+num2+".             |   \n");
            System.out.println("   |                                 |   \n");
            System.out.println("   +---------------------------------+   \n");
        }
   

        System.out.println("             ________________________________________________");
        System.out.println("            /                                                \\");
        System.out.println("           |    _________________________________________     |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |  C:\\> _ TASK 2                         |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |            Sponsored by:                |    |");  
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |               Programming               |    |");
        System.out.println("           |   |                  Club                   |    |");
        System.out.println("           |   |               Development               |    |");
        System.out.println("           |   |                   Unit                  |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |_________________________________________|    |");
        System.out.println("           |                                                  |");
        System.out.println("           \\_________________________________________________/");
        System.out.println("                   \\___________________________________/");
        System.out.println("                ___________________________________________");
        System.out.println("             _-'    .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.  --- `-_");
        System.out.println("          _-'.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.  .-.-.`-_");
        System.out.println("       _-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-`__`. .-.-.-.`-_");
        System.out.println("    _-'.-.-.-.-. .-----.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-----. .-.-.-.-.`-_");
        System.out.println(" _-'.-.-.-.-.-. .---.-. .-------------------------. .-.---. .---.-.-.-.`-_");
        System.out.println(":-------------------------------------------------------------------------:");
        System.out.println("`---._.-------------------------------------------------------------._.---'");
        




 }
}
