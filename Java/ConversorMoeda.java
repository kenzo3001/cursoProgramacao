package Java;

import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantia em dólares: ");
        double quantiaDolares = scanner.nextDouble();
        
        System.out.print("Digite a taxa de câmbio (por exemplo, taxa de conversão para reais): ");
        double taxaCambio = scanner.nextDouble();
        
        double quantiaConvertida = quantiaDolares * taxaCambio;
        
        System.out.println("A quantia em dólares convertida é igual a: " + quantiaConvertida);
        
        scanner.close();
    }
}

