import java.io.ObjectStreamException;
import java.util.Objects;

public class Agenda {
    public Contato[] contatos = new Contato[100];

    public void criaContato(Contato contato){
        int i = 0;
        while (contatos[i] != null) {

            i++;
        }
        contatos[i] = contato;
        System.out.println("Contato adicionado com sucesso");

    }

    public void buscaContato(String nome){
        int validador = 0;
        for (int i = 0; i < contatos.length && nome != null; i++) {
            if (contatos[i].nome == nome) {
                contatos[i].exibeContato();
                validador++;
            }
        }if (validador == 0) {
            System.out.println("Contato não encontrado");
        }
    }

    public void alteraContato(String nome, String novoNome, String novoTel){
        for (int i = 0; i < contatos.length && nome != null; i++) {
            if (contatos[i].nome == nome){
                contatos[i].alteraContato(novoNome,novoTel);
                System.out.println("Contato alterado com sucesso");
            }
        }
    }

    public void apagaContato (String nome){
        for (int i = 0; i < contatos.length && nome != null; i++) {
            if (contatos[i].nome == nome) {
                contatos[i] = null;
                System.out.println("Contato deletado com sucesso");
            }
        }
    }

    public void exibeAgenda(){
        if (contatos[0] != null){
            for (int i = 0; i < contatos.length; i++) {
                if (contatos[i] == null){
                    return;
                }
                contatos[i].exibeContato();
                System.out.print("\n");
            }
        } else {
            System.out.println("Agenda vazia, adicione contatos\n");
        }
    }
}
