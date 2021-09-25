package ListaDois;

import java.util.Scanner;
public class ContaCorrente {
    Scanner teclado = new Scanner(System.in);
    private float saldo;
    private int x = 1;
    private float valorSaque;
    private float valorDeposito;
    private float saldoFinal;


    public ContaCorrente(float saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente() {
        this.saldo = 0;
    }

    //metodos

    public void sacar() {

        System.out.println("Quanto deseja sacar?");
        float valorSaque = teclado.nextFloat();


        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            int x = 1;
            saldoFinal = saldo - valorSaque;
            imprimirOperacaoSaque();
            //System.out.println(saldo + " - " + valorSaque + " = " + saldoFinal);
        }
    }


    public void depositar() {
        System.out.println("Quanto deseja depositar?");
        float valorDeposito = teclado.nextFloat();


        saldo = saldoFinal + valorDeposito;
        imprimirOperacaoDeposito();
        //System.out.println(saldoFinal + " + " + valorDeposito + " = " + saldo);

    }

    public void imprimirOperacaoSaque() {
        System.out.println(saldo + " - " + valorSaque + " = " + saldoFinal);

    }

    public void imprimirOperacaoDeposito(){
        System.out.println(saldoFinal + " + " + valorDeposito + " = " + saldo);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}