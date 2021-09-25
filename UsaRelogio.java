package ListaDois;

import java.util.Scanner;

public class UsaRelogio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Relogio relogio = new Relogio();

        System.out.println("Digite a hora:");
        relogio.setHoras(teclado.nextInt());
        System.out.println("Digite os minutos:");
        relogio.setMinutos(teclado.nextInt());


        relogio.proximaHora();







    }
}
