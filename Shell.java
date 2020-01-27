import java.util.Scanner;

public class Shell {

    public static void main(String[] args) {
        System.out.println("Welcome to Universal Complex Scripting Calculator by UCSC, Sri Lanka.Version: 1.0");
        System.out.print(">>>");
        final Scanner in = new Scanner(System.in);
        final String s = in.nextLine();
        System.out.println(s);
        if(s=="exit" || s=="end" || s=="quit"){
            System.exit(1);
        }else{

        }

    }

}