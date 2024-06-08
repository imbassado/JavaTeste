package Classes;

public class Produto {
    public String nome;
    public float preco;
    public int quantidade;


    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeVendida) {
        if (this.quantidade < quantidadeVendida) {
            System.out.println("Venda não permitida. Quantidade maior que o estoque.");
        } else {
            float totalVenda;
            totalVenda = quantidadeVendida * this.preco;
            System.out.println(this.nome + " foi vendido");
            System.out.println("Total da venda:  R$" + totalVenda);
            System.out.println("Quantidade: " + quantidadeVendida);
            // Estoque
            this.quantidade = this.quantidade - quantidadeVendida;
            System.out.println("Estoque atual: " + this.quantidade);
        }
    }
}
