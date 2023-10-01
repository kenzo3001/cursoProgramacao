package Java;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();

        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        
        double resultado = 0.0;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    System.exit(1); 
                }
                break;
            default:
                System.out.println("Operação inválida. Use +, -, *, ou /.");
                System.exit(1); 
        }

        System.out.println("Resultado: " + resultado);

        
        scanner.close();
    }
}