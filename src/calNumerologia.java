public class calNumerologia{
	public void calNumerologia() {
        while (diaN > 0) {
            resultado += diaN % 10;
            diaN = diaN / 10;
        }
        if (resultado > 10) {
            while (resultado > 0) {
                resultado2 += resultado % 10;
                resultado = resultado / 10;
            }
            System.out.println("Tu numero de la suerte es: " + resultado2);
        } else {
            System.out.println("Tu numero de la suerte es:" + resultado);
        }
    }
}