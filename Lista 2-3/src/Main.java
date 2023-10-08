import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o erro máximo desejado: ");
        double erroMaximo = scanner.nextDouble();

        double estimativa = numero / 2.0; // Estimativa inicial, pode ser qualquer valor razoável

        while (Math.abs((estimativa * estimativa) - numero) > erroMaximo) {
            // O loop continua enquanto a diferença entre a estimativa ao quadrado e o número for maior que o erro máximo
            estimativa = (estimativa + (numero / estimativa)) / 2.0;
        }

        System.out.println("A raiz quadrada aproximada de " + numero + " é aproximadamente " + estimativa);

        scanner.close();
    }
}