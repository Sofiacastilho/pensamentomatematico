package ListaUm;
/*Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu o
seu carro com gasolina. Leia a quantidade de litros de gasolina foram necessários
para abastecer o veículo e informe o valor total da conta desse cliente, sabendo-se
que cada refrigerante custou R$3,00 e o litro de gasolina está custando R$2,50.
(Estrutura Sequencial).*/

import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {

        float refrigerante = 3.0f;
        float litroAbastecido;
        float litroGas= 2.50f;
        float totalConta;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos litros de gasolina foram usados para abastecer o veiculo?");
        litroAbastecido = teclado.nextFloat();

        totalConta= (litroAbastecido*litroGas) + refrigerante*2;

        System.out.println("O valor total da conta foi de: R$" + totalConta);

    }
}
