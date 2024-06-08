package Aulas;
public class Casa {
    private int numQuartos;
    private int metrosQuadrados;
    private int numBanheiros;
    private String Endereco;

    public Casa(int numQuartos, int metrosQuadrados, int numBanheiros, String Endereco){
        this.numQuartos = numQuartos;
        this.metrosQuadrados = metrosQuadrados;
        this.numBanheiros = numBanheiros;
        this.Endereco = Endereco;
    }

    public void setNumQuartos(int numQuartos){
        this.numQuartos = numQuartos;
        System.out.println("O numero de quartos foram alterados para: " + this.getNumQuartos());
    }

    public int getNumQuartos(){
        return numQuartos;
    }

    public void setMetrosQuadrados(int metrosQuadrados){
        this.metrosQuadrados = metrosQuadrados;
        System.out.println("O numero de metros quadrados foram alterados para: " + this.getMetrosQuadrados() + "m²");
    }

    public int getMetrosQuadrados(){
        return metrosQuadrados;
    }

    public void setNumBanheiros(int numBanheiros){
        this.numBanheiros = numBanheiros;
        System.out.println("O numero de banheiros foram alterados para: " + this.getNumBanheiros());
    }

    public int getNumBanheiros(){
        return numBanheiros;
    }

    public void setEndereco(String Endereco){
        this.Endereco = Endereco;
        System.out.println("O endereço foi alterado para: " + this.getEndereco());
    }

    public String getEndereco(){
        return Endereco;
    }
}
