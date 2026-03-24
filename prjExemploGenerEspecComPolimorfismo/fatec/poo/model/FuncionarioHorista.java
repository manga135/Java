package fatec.poo.model;

/**
 * @author Matheus Camargo
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dta, double vht){
        super(r, n, dta);
        valHorTrab = vht;
    }
    
    public void setQtdeHorTrab(int qht){
        qtdeHorTrab = qht;
    }
    
    //aplicação do polimorfismo
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return(calcSalBruto() * 0.075);
    }
    
    //sobrepondo o método da superclasse
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}