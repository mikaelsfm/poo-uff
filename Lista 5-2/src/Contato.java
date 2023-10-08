public class Contato {
    String nome;
    String tel;

    public Contato(String novoNome, String novoTel){
        nome = novoNome;
        tel = novoTel;
    }

    public void alteraContato(String attNome, String attTel){
        nome = attNome;
        tel = attTel;
    }

    public void exibeContato(){
        System.out.println(nome + " - " + tel);
    }
}
