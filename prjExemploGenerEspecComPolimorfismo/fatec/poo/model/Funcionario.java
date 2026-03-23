
package fatec.poo.model;

/**
 * @author Matheus Camargo
 */
public abstract class Funcionario {
    private int registro;
    private String nome, dtAdmissao;
    
    public Funcionario(int r, String n, String dta){
        registro = r;
        nome = n;
        dtAdmissao = dta;   
    }
    //Método abstrato, somente a assinatura do método
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.1 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
}
