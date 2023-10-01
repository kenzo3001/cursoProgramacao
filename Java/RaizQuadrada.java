package Java;

import java.util.Scanner;

public class RaizQuadrada {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        double numero = scanner.nextDouble();

        if (numero >= 0) {
            double raizQuadrada = Math.sqrt(numero);

            System.out.println("A raiz quadrada de " + numero + " é igual a " + raizQuadrada);
        } else {
            System.out.println("O número inserido é negativo. A raiz quadrada de números negativos não é suportada.");
        }

        scanner.close();
    }
}