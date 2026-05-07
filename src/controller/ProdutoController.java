package controller;

import java.util.ArrayList;
import model.Produto;
import repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    @Override
    public void procurarPorTitulo(String titulo) {
        var livro = buscarNaCollection(titulo);
        if (livro != null) {
            livro.visualizar();
        } else {
            System.out.println("\nO livro '" + titulo + "' não foi encontrado!");
        }
    }

    @Override
    public void listarTodos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("\nO acervo está vazio!");
        } else {
            for (var livro : listaProdutos) {
                livro.visualizar();
            }
        }
    }

    @Override
    public void cadastrar(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("\nLivro '" + produto.getTitulo() + "' cadastrado com sucesso!");
    }

    @Override
    public void atualizar(Produto produto) {
        var buscaLivro = buscarNaCollection(produto.getTitulo());
        if (buscaLivro != null) {
            int indice = listaProdutos.indexOf(buscaLivro);
            listaProdutos.set(indice, produto);
            System.out.println("\nO livro '" + produto.getTitulo() + "' foi atualizado!");
        } else {
            System.out.println("\nLivro não encontrado para atualizar!");
        }
    }

    @Override
    public void deletarPorTitulo(String titulo) {
        var livro = buscarNaCollection(titulo);

        if (livro != null) {
            listaProdutos.remove(livro);
            System.out.println("\nO livro '" + titulo + "' foi removido com sucesso!");
        } else {
            System.out.println("\nLivro '" + titulo + "' não encontrado para excluir.");
        }
    }

    
    public Produto buscarNaCollection(String titulo) {
        for (var livro : listaProdutos) {
            if (livro.getTitulo().trim().equalsIgnoreCase(titulo.trim())) {
                return livro;
            }
        }
        return null;
    }
}
