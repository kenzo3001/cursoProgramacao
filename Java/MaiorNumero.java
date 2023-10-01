package Java;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = input.nextDouble();

        double menor, meio, maior;

        if (num1 <= num2) {
            if (num2 <= num3) {

                menor = num1;
                meio = num2;
                maior = num3;
            } else if (num1 <= num3) {

                menor = num1;
                meio = num3;
                maior = num2;
            } else {
                
                menor = num3;
                meio = num1;
                maior = num2;
            }
        } else {
            if (num1 <= num3) {
                
                menor = num2;
                meio = num1;
                maior = num3;
            } else if (num2 <= num3) {
                
                menor = num2;
                meio = num3;
                maior = num1;
            } else {
                
                menor = num3;
                meio = num2;
                maior = num1;
            }
        }
        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}
