package Aulas;
import java.util.Scanner;

public class Censo {
    private int qtdMulheres;
    private int qtdHomens;
    private float maiorAltura;
    private float menorAltura;
    private float mediaAlturaHomens;

    public Censo(){
        qtdMulheres = 0;
        qtdHomens = 0;
        maiorAltura = 0;
        menorAltura = Float.MAX_VALUE;
        mediaAlturaHomens = 0;
    }

    public int getQtdMulheres(){
        return qtdMulheres;
    }

    public void setQtdMulheres(int qtdMulheres){
        this.qtdMulheres = qtdMulheres;
    }

    public int getQtdHomens(){
        return qtdHomens;
    }

    public void setQtdHomens(int qtdHomens){
        this.qtdHomens = qtdHomens;
    }

    public float getMaiorAltura(){
        return maiorAltura;
    }

    public void setMaiorAltura(float maiorAltura){
        this.maiorAltura = maiorAltura;
    }

    public float getMenorAltura() {
        return menorAltura;
    }

    public void setMenorAltura(float menorAltura) {
        this.menorAltura = menorAltura;
    }

    public float getMediaAlturaHomens(){
        return mediaAlturaHomens;
    }

    public void setMediaAlturaHomens(float mediaAlturaHomens){
        this.mediaAlturaHomens = mediaAlturaHomens;
    }

    public void realizarCenso(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de pessoas: ");
        int totalPessoas = scanner.nextInt();

        for(int i = 1; i <= totalPessoas; i++){
            System.out.println("Pessoa " + i + ":");
            System.out.println("Digite o sexo [M] ou [F]: ");
            char sexo = scanner.next().charAt(0);

            System.out.println("Digite a altura: ");
            float altura = scanner.nextFloat();

            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            if(altura < menorAltura){
                menorAltura = altura;
            }

            if(sexo == 'M'){
                mediaAlturaHomens += altura;
                qtdHomens++;
            }else if(sexo == 'F'){
                qtdMulheres++;
            }
        }
        scanner.close();

        if(qtdHomens > 0){
            mediaAlturaHomens /= qtdHomens;
        }

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);
        System.out.println("Número de mulheres: " + qtdMulheres);
    }
}
