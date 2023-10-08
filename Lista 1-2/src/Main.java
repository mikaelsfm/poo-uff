import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double[] p1 = new double[3];
        double[] p2 = new double[3];

        System.out.println("Digite os valores de p1");
        for (int i = 0; i < 3; i++) {
            p1[i] = kb.nextDouble();
        }
        System.out.println("Digite os valores de p2");
        for (int i = 0; i < 3; i++) {
            p2[i] = kb.nextDouble();
        }

        double xAlt = p2[0] - p1[0];
        double yAlt = p2[1] - p1[1];
        double zAlt = p2[2] - p1[2];

        double d = (xAlt*xAlt) + (yAlt*yAlt) + (zAlt*zAlt);
        d = Math.sqrt(d);
        System.out.print(d);
    }
}