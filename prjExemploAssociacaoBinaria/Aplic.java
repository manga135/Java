import fatec.poo.model.Funcionario;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Departamento;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Matheus Camargo
 */
public class Aplic {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("#,##0.00");
       FuncionarioHorista funcHor = new FuncionarioHorista( 1010, "Pedro Silveira", "14/05/1978", 15.80);
       FuncionarioMensalista funcMen = new FuncionarioMensalista( 1111, "Joao da Silva", "15/05/1978", 1621.0);
       FuncionarioComissionado funcCom = new FuncionarioComissionado(1212, "Aderbal Silva", "16/05/1978", 0.1);
       
       Departamento dep1 = new Departamento("CMP", "Compras");
       Departamento dep2 = new Departamento("VEN", "Vendas");
       Departamento dep3 = new Departamento("ADM", "Administração");
       
       funcHor.setCargo("Programador");
       funcMen.setCargo("Aux. Administrativo");
       funcCom.setCargo("Vendedor");
       
       funcHor.setDepartamento(dep1);
       funcMen.setDepartamento(dep3);
       funcCom.setDepartamento(dep2);
       
       System.out.println("O funcionário horista " + funcHor.getNome() + " Trabalha no departamento de " + funcHor.getDepartamento().getNome());
       System.out.println("O funcionário mensalista " + funcMen.getNome() + " Trabalha no departamento de " + funcMen.getDepartamento().getNome());
       System.out.println("O funcionário comissionado " + funcCom.getNome() + " Trabalha no departamento de " + funcCom.getDepartamento().getNome());
       
    }
    
}
