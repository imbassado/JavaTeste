package Aulas;
public class Parede {
    private float altura;
    private float largura;

    public Parede(float altura, float largura){
        this.altura = altura;
        this.largura = largura;
    }

    public int calcularQtdAzulejos(double ha, double la) {
        double areaParede = altura * largura;
        double areaAzulejo = ha * la;

        int quantidadeAzulejos = (int) Math.ceil(areaParede / areaAzulejo);
        return quantidadeAzulejos;
    }
}