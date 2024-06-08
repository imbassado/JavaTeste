
package principal;

public class Principal {

    public static void main(String[] args) {
        // Declaração de uma variável
        int numero = 10;

        // Comandos de saída
        System.out.println("O valor da variável numero é: " + numero);

        // Sintaxe do if-else
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo ou zero.");
        }

        // Sintaxe do for
        System.out.println("Contagem regressiva de 10 até 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // Pula para a próxima linha

        // Sintaxe do do-while
        int contador = 0;
        System.out.println("Contagem crescente de 0 até 5 usando do-while:");
        do {
            System.out.print(contador + " ");
            contador++;
        } while (contador <= 5);
        System.out.println(); // Pula para a próxima linha

        // Sintaxe do while
        int j = 0;
        System.out.println("Contagem crescente de 0 até 5 usando while:");
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println(); // Pula para a próxima linha

        // Vetor de inteiros
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println("Elementos do vetor:");
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println(); // Pula para a próxima linha
    }
}

