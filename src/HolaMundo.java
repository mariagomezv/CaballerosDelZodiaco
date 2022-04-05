import java.util.Scanner;
public class HolaMundo
{
    public static void main (String[] args)
    {
        System.out.println("Hola zodiacos!!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dinos tu nombre: ");
        String nom = scanner.nextLine();
        System.out.println("Bienvenido " + nom + " ya eres un nuevo zodiaco!");      
    }
}
