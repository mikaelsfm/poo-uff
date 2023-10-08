import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void sortVetor(int [] vetor) {
        Arrays.sort(vetor);
        System.out.println("Lista ordenada: ");
        for (int n : vetor) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[100];
        for (int i = 0; i < 100; i++) {
            vetor[i] = random.nextInt(100);
        }
        System.out.println("Lista original: ");
        for (int n : vetor) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
        sortVetor(vetor);
        }
    }
