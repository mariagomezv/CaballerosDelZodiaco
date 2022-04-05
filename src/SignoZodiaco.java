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

                }
                break;
                case(4):
                //
                break;   
                case(5):
                //
                break; 
                case(6):
                //
                break; 
                case(7):
                //
                break; 
                case(8):
                //
                break; 
                case(9):
                //
                break; 
                case(10):
                //
                break; 
                case(11):
                //
                break; 
                case(12):
                //
                break; 
        
            }
        }
    }
}
