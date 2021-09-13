package ListaUm;

/*1. Faça um programa que receba o valor do salário de um funcionário e o percentual
        de aumento, calcule e mostre o valor do aumento e o novo salário.*/

import java.util.Scanner;

public class PercentualAumento {
    public static void main(String[] args) {

        float valorSalario;
        float percentualAumento;
        float valorAumento;
        float novoSalario;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário:");
        valorSalario = teclado.nextFloat();

        System.out.println("Digite o percentual de aumento:");
        percentualAumento = teclado.nextFloat();

        valorAumento = (valorSalario * percentualAumento)/100;

        System.out.println("O valor do seu aumento será de: R$"+ valorAumento);

        novoSalario = valorAumento + valorSalario;

        System.out.println("Seu novo salário será de: R$"+ novoSalario);



    }

}
