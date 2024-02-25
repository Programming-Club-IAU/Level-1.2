import java.util.Scanner;

public class task2 {
    public static void main(String[]args){
    
        Scanner scan= new Scanner(System.in);
        System.out.println(":::,\r\n" + //
                        " '::::'._\r\n" + //
                        "   '.    '.                        __.,,.\r\n" + //
                        "     '.    '.                _..-'''':::\"\r\n" + //
                        "       \\     \\,.--\"\"\"\"--.,-''      _:'\r\n" + //
                        "   /\\   \\  .               .    .-'\r\n" + //
                        "  /  \\   \\                   ':'\r\n" + //
                        " /    \\  :                     :\r\n" + //
                        "/      \\:                       :\r\n" + //
                        "\\       :                       :\r\n" + //
                        " \\      :      ,--,         ,-,  :\r\n" + //
                        "  \\    :      |(_):|       |():| :\r\n" + //
                        "   \\   :     __'--'   __    '-'_  :\r\n" + //
                        "    \\  :    /  \\      \\/      / \\ :\r\n" + //
                        "     \\  :  (    )             \\_/ :\r\n" + //
                        "  .-'' . :  \\__/   '--''--'      :\r\n" + //
                        "  \\  . .-:'.                   .:\r\n" + //
                        "   \\' :| :  '-.__      ___...-' :\r\n" + //
                        "    \\::|:        ''''''          '.\r\n" + //
                        "  .,:::':  :                       '.\r\n" + //
                        "   \\::\\:   :                         '._\r\n" + //
                        "    \\::    :     /             '-._     '.\r\n" + //
                        "     \\:    :    /              .   :-._ :-'\r\n" + //
                        "      :    :   /               :   :  ''\r\n" + //
                        "      :   .'   )'.             :   :\r\n" + //
                        " sjw   :  :  .'   '.          :   :\r\n" + //
                        "        : '..'      :      _.' _.:\r\n" + //
                        "         '._        :..---'\\'''  _)\r\n" + //
                        "            '':---''_)      '-'-'\r\n" + //
                        "               '-'-'         PIKACHU! IS ASKING FOR THE FIRST VALUE TO FIND THE MAX");
        int value1=scan.nextInt();
        System.out.println("PIKACHU! IS ASKING FOR THE SECOND VALUE");
        int value2 = scan.nextInt();
        
    if(value1>value2){
        System.out.println(value1+" IS BIGGER THAN  "+value2);

    }
    else if(value2>value1){
        System.out.println(value2+" IS BIGGER THAN  "+value1);
    }
    else {
        System.out.println("THEY ARE EQUAL !");
    }



    }

}
