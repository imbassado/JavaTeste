package Aulas;
public class Imposto {
    private float valorImposto;
    private String nomeFuncionario;

    public Imposto(){
        valorImposto = 0.0f;
        nomeFuncionario = "";
    }

    public float getValorImposto(){
        return valorImposto;
    }

    public void setValorImposto(float valorImposto){
        this.valorImposto = valorImposto;
    }

    public String getNomeFuncionario(){
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario){
        this.nomeFuncionario = nomeFuncionario;
    }

    public float calcularImposto(float salario){
        if(salario <= 2259.20){
            valorImposto = 0.0f;
        }else if(salario <= 2828.65){
            valorImposto = (float) (salario * 0.075);
        }else if(salario <= 3751.05){
            valorImposto = (float) (salario * 0.15);
        }else if(salario <= 4664.68){
            valorImposto = (float) (salario * 0.225);
        }
        return valorImposto;
    }
}