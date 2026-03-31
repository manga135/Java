package fatec.poo.model;

/**
 * @author Matheus Camargo
 */
public abstract class Funcionario {
    private int registro;
    private String nome, dtAdmissao, cargo;
    private Departamento departamento; //atributo ponteiro
                                       //armaezna o endereço de um obj da classe departamento
                                       //representando a multiplicidade 1
   
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
    
    public int getRegistro(){
        return(registro);
    }
    
    public String getNome(){
        return(nome);
    }
    
    public String getDataAdmissao(){
        return(dtAdmissao);
    }
    
    public void setCargo(String c){
        cargo = c;
    }
    
    public String getCargo(){
        return(cargo);
    }

    //tem como parametro de entrada o endereço de um obj da classe Departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    
    
}
