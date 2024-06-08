package Aulas;
import java.util.Scanner;
public class Main{

public static void main(String[] args) {
        // Cachorro cachorro1 = new Cachorro("Rex", "Labrador");
        // Cachorro cachorro2 = new Cachorro("Bolinha", "Vira-lata");

        // System.out.println("Cachorro 1 - Nome: " + cachorro1.getNome() + ", Raça: " + cachorro1.getRaca());
        // System.out.println("Cachorro 2 - Nome: " + cachorro2.getNome() + ", Raça: " + cachorro2.getRaca());

        // cachorro1.setNome("Thor");
        // cachorro1.setRaca("Poodle");

        // cachorro2.setNome("Juninho");
        // cachorro2.setRaca("Golden Retriever");

        // Casa casa1 = new Casa(2,10,2,"Brasil");
        // System.out.println("Casa 1 - Quartos: " + casa1.getNumQuartos() + ", Metros Quadrados: " + casa1.getMetrosQuadrados() + "m², Banheiros: " + casa1.getNumBanheiros() + ", Endereço: " + casa1.getEndereco());

        // casa1.setNumQuartos(5);
        // casa1.setMetrosQuadrados(20);
        // casa1.setNumBanheiros(4);
        // casa1.setEndereco("Itália");

        // Telefone telefone1 = new Telefone("42988875077","iPhone 12", "Apple");
        // telefone1.ligar();
        // telefone1.desligar();
        // telefone1.carregar();

        // Retangulo retangulo1 = new Retangulo(2, 2);

        // retangulo1.setAltura(5);
        // retangulo1.setLargura(5);

        // int area = retangulo1.calcularArea();
        // System.out.println("Área do retangulo: " + area);

        // int perimetro = retangulo1.calcularPerimetro();
        // System.out.println("Perimetro do retangulo: " + perimetro);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite a altura da parede: ");
        // float hp = scanner.nextFloat();

        // System.out.println("Digite a largura da parede: ");
        // float lp = scanner.nextFloat();

        // System.out.println("Digite a altura do azulejo: ");
        // float ha = scanner.nextFloat();

        // System.out.println("Digite a largura do azulejo: ");
        // float la = scanner.nextFloat();

        // Parede parede1 = new Parede(hp, lp);

        // int quantidadeAzulejos = parede1.calcularQtdAzulejos(ha, la);
        // System.out.println("Quantidade de azulejos necessários: " + quantidadeAzulejos);


        // scanner.close();

        // Censo censo1 = new Censo();
        // censo1.realizarCenso();

        // Imposto imposto1 = new Imposto();
        // imposto1.setNomeFuncionario("Vinicius");
        // float salarioVinicius = 2500.0f;
        // float impostoVinicius = imposto1.calcularImposto(salarioVinicius);

        // System.out.println("Nome: " + imposto1.getNomeFuncionario());
        // System.out.println("Salário: " + salarioVinicius);
        // System.out.println("Imposto cobrado será: R$ " + impostoVinicius);

    Cachorro cachorro1 = new Cachorro("Jorge",4);
    cachorro1.latir();
    cachorro1.comer();

    Gato gato1 = new Gato("Ramsés",3,"laranja");
    gato1.miar();
    
    }
}

