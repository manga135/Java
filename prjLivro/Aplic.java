
import java.util.Scanner;

/**
 *
 * @author Matheus Camargo
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int id, opcao, diasMultas;
        String titulo;
        boolean situacLivro;
        double valMulta;
        
        System.out.println("Digite a identificação do livro: ");
        id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite o título do livro: ");
        titulo = entrada.nextLine();
        System.out.println("Digite o valor da multa diária do livro: ");
        valMulta = entrada.nextDouble();
        
        Livro objLivro = new Livro(id, titulo);
        objLivro.setValMultaDiaria(valMulta);
        
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
                         
                        if(objLivro.devolver(diasMultas) > 0)
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
