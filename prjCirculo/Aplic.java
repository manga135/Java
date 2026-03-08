
import java.util.Scanner;
 
public class Aplic 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        double medRaio;
        int opcao;
        
        System.out.println("Digite a medida do raio do circulo:");
        medRaio = entrada.nextDouble();
        
        Circulo objCir = new Circulo();
        objCir.setRaio(medRaio);
        
        do {
            System.out.println("\n\n1- Calcular Area\n2- Calcular Perimetro\n3- Calcular Diametro\n4 - Sair");
            System.out.print("\nDigite a opcao = ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 4:
                    break;
                case 1:
                    System.out.println("Area do Circulo = " + objCir.calcArea());
                    break;
                case 2:
                    System.out.println("Perimetro do Circulo = " + objCir.calcPerimetro());
                    break;
                case 3:
                    System.out.println("Diametro do Circulo = " + objCir.calcDiametro());
                    break;
            }
        }
            while (opcao < 4);
    }
    
}
