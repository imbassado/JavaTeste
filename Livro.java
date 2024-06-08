package Aula2702;


public class Livro {
    public String titulo;
    public int ano;
    public String autor;

    public Livro (String titulo, int ano, String autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }
    public void emprestar() {
        System.out.println("Foi emprestado");
    }

    public void ler() {
        System.out.println("O livro está sendo lido");
    }
}
