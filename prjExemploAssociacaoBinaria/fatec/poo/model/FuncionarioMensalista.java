package fatec.poo.model;

/**
 *
 * @author Matheus Camargo
 */
public class FuncionarioMensalista extends Funcionario {
    private double valSalMin, numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dta, double vsm){
        super(r, n, dta);
        valSalMin = vsm;
    }
    
    public void setNumSalMin(double num){
        numSalMin = num;
    }
    
    //polimorfismo
     public double calcSalBruto(){
         return(valSalMin * numSalMin);
     }
}
