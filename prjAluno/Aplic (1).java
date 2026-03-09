import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Caroline Espanha Simão
 */
public class Aplic {

    public static void main(String[] args) 
    {
        double notaPrv1, notaPrv2, notaTrab1, notaTrab2;
        int alunoRA, opcao;
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.print("Digite o RA do aluno: ");
        alunoRA = entrada.nextInt();
        objAluno.setRA(alunoRA);
        
        System.out.print("Digite a nota da Primeira Prova do aluno: ");
        notaPrv1 = entrada.nextDouble();
        objAluno.setNtPrv1(notaPrv1);
        
        System.out.print("Digite a nota da Segunda Prova do aluno: ");
        notaPrv2 = entrada.nextDouble();
        objAluno.setNtPrv2(notaPrv2);
        
        System.out.print("Digite a nota do Primeiro Trabalho do aluno: ");
        notaTrab1 = entrada.nextDouble();
        objAluno.setNtTrab1(notaTrab1);
        
        System.out.print("Digite a nota do Segundo Trabalho do aluno: ");
        notaTrab2 = entrada.nextDouble();
        objAluno.setNtTrab2(notaTrab2);
        
        
        do {
            System.out.println("\n\n1- Exibir Nota das Provas/Trabalhos\n2- Exibir Media dos Trabalhos/Provas\n3- Exibir Media Final\n4 - Sair");
            System.out.print("\nDigite a opcao = ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 4:
                    break;
                case 1:
                    System.out.println("\nRA: " + objAluno.getRA() + "\n\nNota da Prova 1: " + objAluno.getNtPrv1() + "\nNota da Prova 2: " + 
                            objAluno.getNtPrv2() + "\nNota do Trabalho 1: " + objAluno.getNtTrab1()+ "\nNota do Trabalho 2: " + objAluno.getNtTrab2());
                    break;
                case 2:
                    System.out.println("\nRA: " + objAluno.getRA() + "\n\nMedia das Provas: " + objAluno.calcMediaProva() + "\nMedia dos Trabalhos: "
                    + objAluno.calcMediaTrab());
                    break;
                case 3:
                    System.out.println("\nRA: " + objAluno.getRA()+ "\n\nMedia Final: " + objAluno.calcMediaFinal());
                    break;
            }
        }
            while (opcao < 4);
    }
    
}
