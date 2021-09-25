package ListaDois;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Insira seu saldo: R$");
        ContaCorrente conta1 = new ContaCorrente(teclado.nextFloat());

        conta1.sacar();


        conta1.depositar();



    }
}
