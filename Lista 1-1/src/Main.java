import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite um valor para a: ");
        a = kb.nextDouble();
        System.out.println("Digite um valor para b: ");
        b = kb.nextDouble();
        System.out.println("Digite um valor para c: ");
        c = kb.nextDouble();

        double delta = (b*b) - (4*a*c);
        double x_pos = ((b*(-1)) + (Math.sqrt(delta)))/(2*a);
        double x_neg = ((b*(-1)) - (Math.sqrt(delta)))/(2*a);

        System.out.println(x_pos);
        System.out.println(x_neg);

    }
}