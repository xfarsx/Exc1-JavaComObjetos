package exc2_java_com_objetos;

public class Aviao implements Voador {
    int horasDeVoo;

    public Aviao() {
    }
    public Aviao(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    public void voar() {
        horasDeVoo = horasDeVoo + 13;
        System.out.println("Estou voando como um aviao por " + horasDeVoo + " horas.");
    }
}
