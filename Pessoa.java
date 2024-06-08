package Aulas;
public class Pessoa {
    public String nome; //atributo
    public int idade; //atributo

    public Pessoa(String nome, int idade) { //método construtor
        this.nome = nome;
        this.idade = idade;
    }
    public void falar() { //método

        System.out.println(this.nome + "Disse Olá");
    }

    public void setNome(String nomeAlterado) {
        this.nome = nomeAlterado;
    }

    public String getNome() {
        return this.nome;
    }
}
