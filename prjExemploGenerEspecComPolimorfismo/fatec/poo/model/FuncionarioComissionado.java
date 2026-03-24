
package fatec.poo.model;

/**
 *
 * @author Matheus Camargo
 */
public class FuncionarioComissionado extends Funcionario {
    private double salBase, taxaComissao, totalVendas;

    public FuncionarioComissionado(int r, String n, String dta, double tc) {
        super(r, n, dta);
        taxaComissao = tc;
    }
    
    
    public double calcSalBruto(){
        return(taxaComissao * totalVendas);
    }
    
    public void setSalbase(double sb){
        salBase = sb;
    }
    
    public double getSalBase(){
        return(salBase);
    }
    
    public double getTotalVendas(){
        return(totalVendas);
    }
    
    public double getTaxaComissao(){
        return(taxaComissao);
    }
    
    public void addVendas(double v){
        totalVendas += v;
    }
    
    public double calcGratificacao(){
        if(totalVendas <= 5000){
            return(calcSalBruto());
        }
        else if(totalVendas > 10000){
            return(calcSalBruto() * 0.05);
        }
        else{
            return(calcSalBruto() * 0.03);
        }
    }
    
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}
