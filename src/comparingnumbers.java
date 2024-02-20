import java.util.Scanner;
public class comparingnumbers {
    public static void main(String[] args) throws Exception {
Scanner Obj = new Scanner(System.in);
        System.out.println("Enter first value");
        int firval = Obj.nextInt();
        System.out.println("Enter second value");
        int secval = Obj.nextInt();

        if (firval > secval) {
            System.out.print("fisrt is greater!");
        } else if(firval<secval) {
            System.out.println("second  is greater!");
        }
        else {
            System.out.print("They are equal!");
        }    }
}
