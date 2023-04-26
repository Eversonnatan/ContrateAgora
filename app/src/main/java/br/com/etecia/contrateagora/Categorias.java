package br.com.etecia.contrateagora;

public class Categorias {
    private String botao;
    private int imagem;

    public Categorias (String botao, int imagem) {
        this.botao = botao;
        this.imagem = imagem;
        this.titulo = titulo;
    }

    public String getBotao() {
        return botao;
    }

    public void setBotao(String botao) {
        this.botao = botao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
