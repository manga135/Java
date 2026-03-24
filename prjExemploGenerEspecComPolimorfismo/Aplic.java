import fatec.poo.model.Funcionario;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import java.util.Scanner;
/**
 *
 * @author Matheus Camargo
 */
public class Aplic {

    public static void main(String[] args) {
       FuncionarioHorista funcHor = new FuncionarioHorista( 1010, "Pedro Silveira", "14/05/1978", 15.80);
       FuncionarioMensalista funcMen = new FuncionarioMensalista( 1111, "Joao da Silva", "15/05/1978", 1621.0);
       FuncionarioComissionado funcCom = new FuncionarioComissionado(1212, "Aderbal Silva", "16/05/1978", 0.1);
       
       funcHor.setCargo("Programador");
       funcHor.setQtdeHorTrab(90);
       System.out.println("Cargo: " + funcHor.getCargo());
       System.out.println("Registro do Funcionário: " + funcHor.getRegistro());
       System.out.println("Nome do Funcionário: " + funcHor.getNome());
       System.out.println("Data de admissão do funcionário: " + funcHor.getDataAdmissao());
       System.out.println("Valor Salario bruto: " + funcHor.calcSalBruto());
       System.out.println("Gratificação: " + funcHor.calcGratificacao());
       System.out.println("Desconto: " + funcHor.calcDesconto());
       System.out.println("Salário Líquido: " + funcHor.calcSalLiquido());
       
       funcMen.setCargo("Gerente");
       funcMen.setNumSalMin(3);
       System.out.println("\n\nCargo: " + funcMen.getCargo());
       System.out.println("Registro do Funcionário: " + funcMen.getRegistro());
       System.out.println("Nome do Funcionário: " + funcMen.getNome());
       System.out.println("Data de admissão do funcionário: " + funcMen.getDataAdmissao());
       System.out.println("Valor Salario bruto: " + funcMen.calcSalBruto());
       System.out.println("Desconto: " + funcMen.calcDesconto());
       System.out.println("Salário Líquido: " + funcMen.calcSalLiquido());
       
       funcCom.setCargo("Vendedor");
       funcCom.addVendas(10000);
       System.out.println("\n\nCargo: " + funcCom.getCargo());
       System.out.println("Registro do Funcionário: " + funcCom.getRegistro());
       System.out.println("Nome do Funcionário: " + funcCom.getNome());
       System.out.println("Data de admissão do funcionário: " + funcCom.getDataAdmissao());
       System.out.println("Valor Salario bruto: " + funcCom.calcSalBruto());
       System.out.println("Desconto: " + funcCom.calcDesconto());
       System.out.println("Salário Líquido: " + funcCom.calcSalLiquido());
    }
    
}
