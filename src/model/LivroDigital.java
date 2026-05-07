package model;

public class LivroDigital extends Produto { // Classe Filha / Estendida: Herança, Polimorfismo
	
	private String linkDownload;
	
	public LivroDigital(int id, String titulo, int tipo, float preco, String linkDownload) {
		super(id, titulo, tipo, preco);
		this.linkDownload = linkDownload;	
	}

	public String getLinkDownload() {
		return linkDownload;
	}
	public void setLinkDownload(String linkDownload) {
		this.linkDownload = linkDownload;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Link de Acesso: " + this.linkDownload);
	}
	

	
	
	
	

}
