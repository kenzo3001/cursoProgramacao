package Java;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3.0;
        
        if (media >= 6.0) {
            System.out.println("O aluno foi aprovado com média " + media);
        } else {
            System.out.println("O aluno foi reprovado com média " + media);
        }
        
        scanner.close();
    }
}