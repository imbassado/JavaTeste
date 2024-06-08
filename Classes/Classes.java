
package Classes;

public class Classes {

    public static void main(String[] args) {
        Carro carro1 = new Carro("vermelho", "Fox");
        carro1.andar();
        carro1.frear();
        
        Produto produto1 = new Produto("Maçã", 1.50f, 50);
        produto1.vender(100);
        
        Produto produto2 = new Produto("Pera", 2.00f, 200);
        produto2.vender(30);
    }
}
