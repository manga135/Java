
package fatec.poo.model;

/**
 *
 * @author Matheus Camargo
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;
    
    public Pessoa(String n, String dn){
        nome = n;
        dataNascimento = dn;
    }
    
    public String getNome(){
        return(nome);
    }
    
    public String getDataNascimento(){
        return(dataNascimento);
    }
    
    
    
}
