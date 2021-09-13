package ListaUm;
/*A prefeitura de Curitiba abriu uma linha de crédito para os funcionários municipais.
O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer
um algoritmo que permita entrar com o salário bruto e o valor da prestação e informar
se o empréstimo pode ou não ser concedido. (comando if)*/

import java.util.Scanner;

public class LinhaCredito {
    public static void main(String[] args) {
        float salarioBruto;
        float valorPrestacao;
        float valorMaximo;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu salário bruto:");
        salarioBruto = teclado.nextFloat();

        System.out.println("Digite o valor da prestação:");
        valorPrestacao = teclado.nextFloat();

        valorMaximo = (30 * salarioBruto)/100;

        if (valorPrestacao <= valorMaximo){
            System.out.println("Emprestimo pode ser concedido.");
        }
        else{
            System.out.println("Emprestimo não pode ser concedido");
        }






    }
}
