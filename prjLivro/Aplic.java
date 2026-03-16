
import java.util.Scanner;

/**
 *
 * @author Yuki
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int identLivro, opcao, diasMultas;
        String tituloLivro;
        boolean situacLivro;
        double valorMulta;
        
        System.out.println("Digite a identificação do livro: ");
        identLivro = entrada.nextInt();
        System.out.println("Digite o título do livro: ");
        tituloLivro = entrada.next();
        System.out.println("Digite o valor da multa diária do livro: ");
        valorMulta = entrada.nextDouble();
        
        Livro objLivro = new Livro(identLivro, tituloLivro);
        objLivro.setValMultaDiaria(valorMulta);
        
        do {
            System.out.println("\n1 - Consultar Livro");
            System.out.println("2 - Emprestar Livro");
            System.out.println("3 - Devolver Livro");
            System.out.println("4 - Sair");
            System.out.println("\n\t\tDigite a opção:");
            opcao = entrada.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Identificação do Livro: " + objLivro.getIdentificacao());
                    System.out.println("Título do Livro: " + objLivro.getTitulo());
                
                    if(objLivro.getSituacao() == false) {
                        System.out.println("\nSituação do Livro: Disponível");
                    }
                    else {
                        System.out.println("\nSituação do Livro: Emprestado");
                    }
                    System.out.println("----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------------------------------");
                    
                    if(objLivro.getSituacao() == false) {
                        objLivro.Emprestar();
                        System.out.println("Operação de empréstimo realizada com sucesso");
                    }
                    else {
                        System.out.println("O livro está emprestado");
                    }
                    System.out.println("----------------------------------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------------------------------");
                    
                    if(objLivro.getSituacao() == false) {
                        System.out.println("O livro já está disponível");
                    }
                    else {
                        System.out.println("Digite a quantidade de dias em atraso do livro: ");
                        diasMultas = entrada.nextInt();
                        
                        System.out.println("\nOperação de devolução com sucesso");
                        System.out.println("Valor da multa: " + objLivro.devolver(diasMultas));
                    }
                    System.out.println("----------------------------------------------------");
                    break;
                case 4:
                    break;
            } 
        } while(opcao < 4);
    } 
}
