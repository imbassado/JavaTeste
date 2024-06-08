package Aulas;

public class Telefone{
    public String numero;
    public String modelo;
    public String marca;
    private boolean ligado;

    public Telefone(String numero, String modelo, String marca){
        this.numero = numero;
        this.modelo = modelo;
        this.marca = marca;
        this.ligado = false; // Inicializando como desligado.
    }

    public void ligar(){ // Se estiver desligado, irá ligar.
        if(!ligado){
            System.out.println("Ligando o telefone " + marca + " " + modelo + ".");
            ligado = true;
        }else{
            System.out.println("O telefone " + marca + " " + modelo + " já esta ligado.");
        }
    }

    public void desligar(){ // Se estiver ligado, irá desligar.
        if(ligado){
            System.out.println("Desligando o telefone " + marca + " " + modelo + ".");
        }else{
            System.out.println("O telefone " + marca + " " + modelo + " já esta desligado.");
        }
    }

    public void carregar(){
        System.out.println("Carregando o telefone " + marca + " " + modelo + ".");
    }
}