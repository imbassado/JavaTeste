package Aulas;

public class Animal {
    public String nome;
    public int qtdPatas;

    public Animal(String nome, int qtdPatas){
        this.nome = nome;
        this.qtdPatas = qtdPatas;
    }

    public void comer(){
        System.out.println(this.nome + " esta se alimentando.");
    }
}
