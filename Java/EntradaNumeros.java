package Java;
import java.util.Scanner;

public class EntradaNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + soma + ".");

        scanner.close();
    }
}