import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class diasSufridos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su dia de nacimiento");
        int diaN = scanner.nextInt();
        System.out.println("Digite su mes de nacimiento");
        int mesN = scanner.nextInt();
        System.out.println("Digite su año de nacimiento");
        int anioN = scanner.nextInt();
        LocalDate diaNacimiento = LocalDate.of(anioN, mesN, diaN);
        LocalDate fechaActual = LocalDate.now();
        long diasSufridos= ChronoUnit.DAYS.between(diaNacimiento, fechaActual);
        System.out.println("Tu numero de dias Vividos es " + diasSufridos);
    }
}

