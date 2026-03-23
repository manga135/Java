import fatec.poo.model.Funcionario;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.util.Scanner;
/**
 *
 * @author Matheus Camargo
 */
public class Aplic {

    public static void main(String[] args) {
       FuncionarioHorista funcHor = new FuncionarioHorista( 1010, "Pedro SIlveira", "14/05/1978", 15.80);
       FuncionarioMensalista funcMen = new FuncionarioMensalista( 1111, "Joao da Silva", "15/05/1978", 1621.0);
       
       funcHor.setQtdeHorTrab(90);
       System.out.println("Valor Salario bruto: " + funcHor.calcSalBruto());
       System.out.println("Desconto: " + funcHor.calcDesconto());
       System.out.println("Salário Líquido: " + funcHor.calcSalLiquido());
       
       funcMen.setNumSalMin(3);
       System.out.println("\n\nValor Salario bruto: " + funcMen.calcSalBruto());
       System.out.println("Desconto: " + funcMen.calcDesconto());
       System.out.println("Salário Líquido: " + funcMen.calcSalLiquido());
    }
    
}
