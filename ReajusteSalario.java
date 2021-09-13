package ListaUm;
/*Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários são
        inferiores a 500 reais. Escreva um programa que leia o salário de vários funcionários
        se mostre o valor do salário reajustado ou uma mensagem caso o funcionário não
        tenha direito ao aumento. O programa será encerrado quando se digitar “fim” para o
        nome do funcionário. (Comando while)*/

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {

        String funcionario = "";
        float valorSalario;
        float aumento = 0.2f;
        float novoSalario;


        Scanner teclado = new Scanner(System.in);

        while (true){
            System.out.println("Digite o nome do funcionário:");
            funcionario = teclado.nextLine();

            if(funcionario.equalsIgnoreCase("Fim")){
                System.exit(0);
            }

            System.out.println("Digite o valor do salário:");
            valorSalario = teclado.nextFloat();


            if (valorSalario <= 500){
                novoSalario = valorSalario + (valorSalario*aumento);
                System.out.println("Com o aumento, seu novo salario é: R$"+ novoSalario);
            }
            else {
                System.out.println("Valor não indiciado para aumento.");
            }

            System.out.println("Para terminar, digite 'Fim'");


        }

    }

}