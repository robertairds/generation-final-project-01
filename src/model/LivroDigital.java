package model;

public class LivroDigital extends Produto {
    private String linkDownload;

    public LivroDigital(String titulo, int tipo, float preco, String linkDownload) {
        super(titulo, tipo, preco);
        this.linkDownload = linkDownload;
    }

    public String getLinkDownload() { return linkDownload; }
    public void setLinkDownload(String linkDownload) { this.linkDownload = linkDownload; }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Link: " + this.linkDownload);
    }
}
