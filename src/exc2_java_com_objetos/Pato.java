package exc2_java_com_objetos;

public class Pato implements Voador {
    int energia;

    public Pato() {
    }
    public Pato(int energia) {
        this.energia = energia;
    }
    @Override
    public void voar() {
        energia = energia - 5;
        System.out.println("Estou voando como um Pato e tenho mais " + energia + " de energia.");
    }
}
