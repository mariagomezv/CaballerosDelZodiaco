import java.util.Scanner;
public class SignoZodiaco
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su dia de nacimiento");
        int diaN = scanner.nextInt();
        System.out.println("Digite su mes de nacimiento");
        int mesN = scanner.nextInt();
        
        if(diaN >=31 || diaN <1)
        {
            System.out.println("Te saliste del rango, eres un malnacido :(");
        }
        else if(mesN >12 || mesN <1)
        {
            System.out.println("Te saliste del rango");
        }
        else{
            switch(mesN){
                case(1):
                if (diaN >= 1 && diaN <= 20)
                {
                    System.out.println("Tu eres Capricornio, el signo mas chimba");
                }
                else{
                    System.out.println("Tu signo es Acuario");
                }
                break;  
                case(2):
                if (diaN >=1 && diaN <= 19)
                {
                    System.out.println("Tu eres Acuario");
                }
                else if(diaN >= 20)
                {
                    System.out.println("Tu eres piscis");
                }
                break;
                case(3):
                if (diaN >=1 && diaN <=20)
                {
                    System.out.println("Tu eres Piscis");
                }
                else if(diaN >=21){
                    System.out.println("Tu eres Aries");
                }
                break;
                case(4):
                if (diaN >=1 && diaN <=20)
                {
                    System.out.println("Tu eres Aries");
                }
                else if(diaN >=21){
                    System.out.println("Tu eres Tauro");
                }
                break;   
                case(5):
                if (diaN >=1 && diaN <=21)
                {
                    System.out.println("Tu eres Tauro");
                }
                else if(diaN >=22){
                    System.out.println("Tu eres Geminis");
                }
                break; 
                case(6):
                if (diaN >=1 && diaN <=21)
                {
                    System.out.println("Tu eres Geminis");
                }
                else if(diaN >=22){
                    System.out.println("Tu eres Cancer");
                }
                break; 
                case(7):
                if (diaN >=1 && diaN <=22)
                {
                    System.out.println("Tu eres Cancer");
                }
                else if(diaN >=23)
                {
                    System.out.println("Tu eres Leo");
                }
                break; 
                case(8):
                if (diaN >=1 && diaN <=23)
                {
                    System.out.println("Tu eres Leo");
                }
                else if(diaN >=24)
                {
                    System.out.println("Tu eres Virgo");
                }
                break; 
                case(9):
                if (diaN >=1 && diaN <=23)
                {
                    System.out.println("Tu eres Virgo");
                }
                else if(diaN >=24)
                {
                    System.out.println("Tu eres Libra");
                }
                break; 
                case(10):
                if (diaN >=1 && diaN <=23)
                {
                    System.out.println("Tu eres Libra");
                }
                else if(diaN >=24)
                {
                    System.out.println("Tu eres Escorpio");
                }
                break; 
                case(11):
                if (diaN >=1 && diaN <=22)
                {
                    System.out.println("Tu eres Escorpio");
                }
                else if(diaN >=23)
                {
                    System.out.println("Tu eres Sagitario");
                }
                break; 
                case(12):
                if (diaN >=1 && diaN <=21)
                {
                    System.out.println("Tu eres Sagitario");
                }
                else if(diaN >=22)
                {
                    System.out.println("Tu eres Capricornio");
                }
                break; 
        
            }
        }
    }
}
