package model; 

public class Produto { //Classe Mãe / Super-Classe: Modificadores de Acesso, Atributos, Classe Abstrata 
	
	// Atributos:
	private int id;
	private String titulo;
	private int tipo;
	private float preco;
	
    // Método construtor:
	public Produto(int id, String titulo, int tipo, float preco) {
		this.id = id;
		this.titulo = titulo;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	// Get e Set: modificadores de acesso
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

	
	public void visualizar( ) {
		String tipoLivro = (this.tipo == 1) ? "Físico" : "Digital";
		
		System.out.println("\n*****************************************************");
        System.out.println("                DADOS DO PRODUTO                     ");
        System.out.println("*****************************************************");
        System.out.println("ID: " + this.id);
        System.out.println("Título: " + this.titulo);
        System.out.println("Tipo: " + tipoLivro);
        System.out.println("Preço: R$ " + this.preco);

	}
}
