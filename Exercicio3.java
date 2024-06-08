public class Exercicio3 {
    public static void main (String[] args){
        int num, i, resultado;
        for(num=0;num<=10;num++){
            for(i=1;i<=10;i++) {
                System.out.println("tabuada do " + num + ": ");
                resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
            }
        }
    }
}
