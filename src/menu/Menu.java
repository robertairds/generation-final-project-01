package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // Entrada de dados
		
		int opcao; // Variáveis
		
		while (true) { // Laço de repetição
			
			// Saída de dados:
            System.out.println("*****************************************************");
            System.out.println("                LIVRARIA - HODGES FIGGIS             ");
            System.out.println("*****************************************************");
            System.out.println("            1 - Cadastrar Livro                      ");
            System.out.println("            2 - Listar Acervo                        ");
            System.out.println("            3 - Atualizar Livro                      ");
            System.out.println("            4 - Excluir Livro                        ");
            System.out.println("            5 - Sair                                 ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada: ");
            
            // Entrada de dados:
            opcao = leia.nextInt(); // Lê o número digitado
            
            // Laços Condicionais:
            if (opcao == 5) {
            	System.out.println("\nLivraria fechada!");
            	leia.close();
            	System.exit(0); // Encerra o programa 
            }
            
            // Laços Condicionais
            switch (opcao) { // Direciona para a ação escolhida
            case 1:
                System.out.println("Opção: Cadastrar Livro\n");
                break; 
            case 2:
                System.out.println("Opção: Listar Acervo\n");
                break;
            case 3:
                System.out.println("Opção: Atualizar Livro\n");
                break;
            case 4:
                System.out.println("Opção: Excluir Livro\n");
                break;
            default:
                System.out.println("\nOpção Inválida!\n");
                break;
            }
		}
	}
}
