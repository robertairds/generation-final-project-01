package repository;

import model.Produto;

public interface ProdutoRepository { 
	
	public void procurarPorTitulo(String titulo);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletarPorTitulo(String titulo);
}
