package Aula2702;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Nescau", 2.90F, 10);

        Produto produto2 = new Produto("Giz", 1.00f,100);
        produto2.vender(10);
    }
}
