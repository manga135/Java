
import java.util.Scanner;


/**
 *
 * @author Matheus Camargo
 */
public class Aplic {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        int opcao;
        Retangulo objRet = new Retangulo();
                
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();//parecido com scanf("%lf", &medAlt);
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        
       do{
           System.out.println("\n\n1 - Consultar Área");
           System.out.println("2 - Consultar Perímetro");
           System.out.println("3 - Consultar Diagonal");
           System.out.println("4 - Sair");
           System.out.println("\n\t\tDigite a opção: ");
           opcao = entrada.nextInt();
           
           if (opcao == 1) {
               System.out.println("Medida da área do retângulo: " +
                objRet.calcArea());
           }
           
           if (opcao == 2){
               System.out.println("Medida do perímetro do retângulo: " +
                objRet.calcPerimetro());
           }
           
           if (opcao == 3){
               System.out.println("Medida da diagonal do retângulo: " +
                objRet.calcDiagonal());
           }
           
           if (opcao == 4){
               break;
           }
           
           if (opcao > 4){
               System.out.println ("Opção inválida");
           }
           
       } while(true);
               
        
    }
    
}
