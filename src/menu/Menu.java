package menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import controller.ProdutoController;
import model.LivroDigital;


public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		ProdutoController produtos = new ProdutoController();
		
		int opcao, tipo; // 
		String titulo, link, buscaTitulo;
		float preco;
		
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
            
            try {
            	opcao = leia.nextInt(); 
            } catch (InputMismatchException e) {
            	System.err.println("\nERRO: Digite apenas números inteiros!");
            	leia.nextLine();
            	opcao = 0;
            }
            
            if (opcao == 5) {
            	System.out.println("\nLivraria fechada!");
            	leia.close();
            	System.exit(0); 
            }
            
            // Laços Condicionais
            switch (opcao) { 
            case 1:
            	System.out.println("Cadastrar Livro\n");

				System.out.println("Digite o Título do Livro: ");
				leia.skip("\\R?"); 
				titulo = leia.nextLine();

				System.out.println("Digite o Preço: ");
				preco = leia.nextFloat();

				System.out.println("Digite o Tipo (1-Físico ou 2-Digital): ");
				tipo = leia.nextInt();

				if (tipo == 2) {
					System.out.println("Digite o Link de Download: ");
					leia.skip("\\R?");
					link = leia.nextLine();
					produtos.cadastrar(new LivroDigital(titulo, tipo, preco, link));
				} else {
					System.out.println("Apenas Livros Digitais estão ativos no momento.");
				}
                break; 
                
            case 2:
                System.out.println("Opção: Listar Acervo\n");
                produtos.listarTodos();
                break;
                
            case 3:
                System.out.println("Opção: Atualizar Livro\n");
                System.out.println("Digite o Título do livro que deseja atualizar: ");
				leia.skip("\\R?");
				buscaTitulo = leia.nextLine();

				var buscaLivro = produtos.buscarNaCollection(buscaTitulo);

				if (buscaLivro != null) {
					System.out.println("Digite o Novo Título: ");
					titulo = leia.nextLine();

					System.out.println("Digite o Novo Preço: ");
					preco = leia.nextFloat();
					
					System.out.println("Digite o Novo Link: ");
					leia.skip("\\R?");
					link = leia.nextLine();

					produtos.atualizar(new LivroDigital(titulo, buscaLivro.getTipo(), preco, link));
				} else {
					System.out.println("\nLivro não encontrado!");
				}
                break;
                
            case 4:
                System.out.println("Opção: Excluir Livro\n");
                System.out.println("Digite o Título do livro para apagar: ");
                leia.skip("\\R?");
                String tituloParaDeletar = leia.nextLine();
               
                produtos.deletarPorTitulo(tituloParaDeletar); 
                break;
                
                
            default:
                System.out.println("\nOpção Inválida!\n");
                break;
            }
		}
	}
}
