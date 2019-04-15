package exc1_java_com_interfaces;

public class Documento implements Imprimivel {
    String nome;
    String tipo;

    public Documento() {
    }
    public Documento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento word! " + nome + tipo);
    }
}
