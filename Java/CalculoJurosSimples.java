package Java;

import java.util.Scanner;

public class CalculoJurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do capital (R$): ");
        double capital = scanner.nextDouble();


        System.out.print("Digite a taxa de juros (%): ");
        double taxaDeJuros = scanner.nextDouble() / 100;


        System.out.print("Digite o período (em meses): ");
        int periodo = scanner.nextInt();

        double jurosSimples = capital * taxaDeJuros * periodo;

        double montante = capital + jurosSimples;

        System.out.println("\nJuros Simples: R$" + jurosSimples);
        System.out.println("Montante Total: R$" + montante);

        scanner.close();
    }
}
