package ListaUm;

/*Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’
se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar. (Comando if).*/

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int numero;
        int cont = 0;

        Scanner teclado = new Scanner(System.in);


        while (cont <10) {
            System.out.println("Digite um numero:");
            numero = teclado.nextInt();
            if (numero >= 0) {
                if (numero % 2 == 0) {
                    System.out.println("É par.");
                } else {
                    System.out.println("É impar.");
                }

            } else {
                System.out.println("Numero invalido.");
            }
            cont++;
        }

    }

}
