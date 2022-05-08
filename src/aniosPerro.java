import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AniosPerro{
    private int diaN;
    private int mesN;
    private int anioN;
    private long diasConver;

    public void calAniosPerro() {
        LocalDate diaNaci = LocalDate.of(anioN, mesN, diaN);
        LocalDate fechaAct = LocalDate.now();
        diasConver = ChronoUnit.DAYS.between(diaNaci, fechaAct);
        System.out.println((diasConver / 365) / 7);
    }

}
