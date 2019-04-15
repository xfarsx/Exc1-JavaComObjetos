package exc1_java_com_interfaces;

public class Foto implements Imprimivel{

    String nome;
    String tipo;

    public Foto() {
    }
    public Foto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie! " + nome + tipo);
    }
}
