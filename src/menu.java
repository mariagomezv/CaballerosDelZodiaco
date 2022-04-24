import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class menu extends preMenu {
    public static void main(String args[]) throws Exception {

        // This is the tittle
        System.out.println(ANSI_GREEN+"");
        InputStream ins = new FileInputStream( "titulo.txt" );
        Scanner scanner2 = new Scanner(ins);
        while (scanner2.hasNextLine())
            System.out.println(scanner2.nextLine());
        scanner2.close();
        System.out.println(ANSI_RESET);
    }
}