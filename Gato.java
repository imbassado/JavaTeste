package Aulas;

public class Gato extends Animal{

    public String cor;
    public Gato(String nome, int qtdPatas, String cor){
        super(nome, qtdPatas);
        this.cor = cor;
    }

    public void miar(){
        System.out.println("O gato " + this.nome + " miou.");
    }
}
