public class aniosPerro(){
    public void aniosPerro() {
        LocalDate diaNaci = LocalDate.of(anioN, mesN, diaN);
        LocalDate fechaAct = LocalDate.now();
        diasConver = ChronoUnit.DAYS.between(diaNaci, fechaAct);
        System.out.println((diasConver / 365) / 7);
    }    
}
