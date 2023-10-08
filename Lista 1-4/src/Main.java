import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String nome;
        double preco;
        int qtd;

        System.out.println("Informe o nome do produto");
        nome = kb.next();
        System.out.println("Informe o preço");
        preco = kb.nextDouble();
        System.out.println("Informe a quantidade");
        qtd = kb.nextInt();

        double total = qtd * preco;

        if (qtd <= 10) {
           System.out.println("Produto: " + nome);
           System.out.println("Valor total: " + total);
        } else if (qtd <= 20) {
            System.out.println("Produto: " + nome);
            System.out.println("Valor total: " + (total * 0.9));
        } else if (qtd <= 50) {
            System.out.println("Produto: " + nome);
            System.out.println("Valor total: " + (total * 0.8));
        } else {
            System.out.println("Produto: " + nome);
            System.out.println("Valor total: " + (total * 0.75));
        }
    }
}
