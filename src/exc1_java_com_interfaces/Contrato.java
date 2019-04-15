package exc1_java_com_interfaces;

public class Contrato implements Imprimivel {
    String nome;
    String tipo;

    public Contrato() {
    }
    public Contrato(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato legal! " + nome + tipo);
    }
}
