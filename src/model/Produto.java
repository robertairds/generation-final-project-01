package model;

public abstract class Produto { 
	
	
    private String titulo;
    private int tipo;
    private float preco;

    
    public Produto(String titulo, int tipo, float preco) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.preco = preco;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public int getTipo() {
        return tipo;
    }

    public float getPreco() {
        return preco;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
   
    public void visualizar() {
        String tipoLivro = (this.tipo == 1) ? "Físico" : "Digital";
        System.out.println("*****************************************************");
        System.out.println("Título: " + this.titulo);
        System.out.println("Tipo: " + tipoLivro);
        System.out.println("Preço: R$ " + this.preco);
    }
}
