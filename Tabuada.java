package ListaUm;

/*. Faça um programa em Java que permita ao usuário escolher a tabuada que deseja
ver. Mostrar a tabuada escolhida. (Comando for)*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        int numTabuada;
        int multiplicacao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual numero deseja saber a tabuada?");
        numTabuada= teclado.nextInt();

        for (int cont = 0; cont < 11;){
            multiplicacao = numTabuada * cont;

            System.out.println(numTabuada + "x" + cont + "=" + multiplicacao);

            cont++;
        }




    }
}