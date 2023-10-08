import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Main extends Agenda {

    static Scanner kb = new Scanner(System.in);

    public static int escolheOpcao() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        if (n < 1 || n > 5) {
            System.out.println("Opcao invalida, escolha uma das opçoes");
            escolheOpcao();
        }
        return n;
    }

    public static void menu(Agenda agenda) {
        System.out.println("Escolha uma das opções");
        System.out.println("1 - Criar contato\n" +
                "2 - Alterar contato\n" +
                "3 - Apagar Contato\n" +
                "4 - Busca Contato\n" +
                "5 - Exibe contatos");

        int n = escolheOpcao();
        if (n == 1) {
            System.out.println("Digite o nome para o contato e logo após o telefone");
            agenda.criaContato(new Contato(kb.next(), kb.next()));
        } else if (n == 2) {
            System.out.println("Digite o nome do contato que deseja alterar");
            String nomeAtual = kb.next();
            System.out.println("Digite os novos dados para o contato");
            agenda.alteraContato(nomeAtual, kb.next(), kb.next());
        } else if (n == 3) {
            System.out.println("Digite o nome do contato que deseja apagar");
            agenda.apagaContato(kb.next());
        } else if (n == 4) {
            System.out.println("Informe o nome do contato que deseja localizar");
            agenda.buscaContato(kb.next());
        } else if (n == 5) {
            if (agenda != null) {
                agenda.exibeAgenda();
            }
        }
    }


    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        System.out.println("Bem-vindo ao aplicativo da agenda");
        while (true){
            menu(agenda);
        }
    }
}
