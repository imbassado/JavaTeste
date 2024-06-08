package Aulas;

public class Cachorro extends Animal{

    public Cachorro(String nome, int qtdPatas){
        super(nome, qtdPatas);
    }

    public void latir(){
        System.out.println(this.nome + " latiu.");
    }

}
