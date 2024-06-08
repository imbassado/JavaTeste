package Classes;

public class Carro {
    public String cor;
    public String modelo;
    
    public Carro(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }
    
    public void andar(){
        System.out.println("O "+this.modelo+" andou!");
    }
    
    public void frear(){
        System.out.println("O "+this.modelo+" freou!");
    }
}
