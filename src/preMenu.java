import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class preMenu {

    // Variables
    Scanner scanner = new Scanner(System.in);
    private static int eleccion;
    private static int diaN;
    private static int mesN;
    private static int anioN;
    private long diasConver;
    private long diasTotal;
    private int resultado = 0;
    private int resultado2 = 0;

    //Colores de consola
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // Constructores
    public preMenu() {
    }

    public preMenu(int diaN, int mesN, int anioN, long diasTotal) {
        preMenu.diaN = diaN;
        preMenu.mesN = mesN;
        preMenu.anioN = anioN;
        this.diasTotal = diasTotal;
    }

    public preMenu(int diaN, int mesN) {
        preMenu.diaN = diaN;
        preMenu.mesN = mesN;
    }

    public preMenu(int diaN, int mesN, int anioN) {
        preMenu.diaN = diaN;
        preMenu.mesN = mesN;
        preMenu.anioN = anioN;
    }


    // Getters Y Setters
    public static int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        preMenu.eleccion = eleccion;
    }

    public static int getDiaN() {
        return diaN;
    }

    public void setDiaN(int diaN) {
        preMenu.diaN = diaN;
    }

    public static int getMesN() {
        return mesN;
    }

    public void setMesN(int mesN) {
        preMenu.mesN = mesN;
    }

    public int getAnioN() {
        return anioN;
    }

    public void setAnioN(int anioN) {
        preMenu.anioN = anioN;
    }

    public long getDiasTotal() {
        return diasTotal;
    }

    public void setDiasTotal(long diasTotal) {
        this.diasTotal = diasTotal;
    }
}