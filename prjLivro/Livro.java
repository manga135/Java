/**
 *
 * @author Yuki
 */
public class Livro {
    int identificacao;
    String titulo;
    boolean situacao;
    double valMultaDiaria;
    
    Livro(int i, String t) {
        identificacao = i;
        titulo = t;
    }
    
    void setValMultaDiaria(double m) {
        valMultaDiaria = m;
    }
    
    int getIdentificacao() {
        return identificacao;
    }
    
    String getTitulo() {
        return titulo;
    }
    
    boolean getSituacao() {
        return situacao;
    }
    
    void Emprestar() {
        situacao = true; 
    }
    
    double devolver(int qtdDias) {
        situacao = false;
        return (valMultaDiaria * qtdDias);
    }
}