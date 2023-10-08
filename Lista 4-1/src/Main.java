import java.util.Scanner;

public class Main {
    public static int getTempo(int tempoSeg){
        return  tempoSeg;
    }

    public static int setTempo (int tempoSeg) {
        return tempoSeg;
    }

    public static int calculaHora (int tempoSeg) {
        int horas = 0;
        while (tempoSeg/horas > 1) {
            tempoSeg = tempoSeg-3600;
            horas = horas + 1;
        }
        System.out.print(horas + ":");
        return tempoSeg;
    }

    public static int calculaMinuto (int tempoSeg){
        int minutos = 0;
        while (tempoSeg < minutos){
            System.out.println("teste");
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Digite o tempo em segundos");
        Scanner kb = new Scanner(System.in);
        int tempoSeg = setTempo(getTempo(kb.nextInt()));
        tempoSeg = calculaHora(tempoSeg);



    }
}