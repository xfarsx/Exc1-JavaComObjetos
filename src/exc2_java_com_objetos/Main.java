package exc2_java_com_objetos;

public class Main {
    public static void main(String[] args) {

        Aviao aviao = new Aviao(14);
        Pato pato = new Pato(10);
        Super_Homem superhomem = new Super_Homem(24);
        TorreDeControle tdc = new TorreDeControle();

        tdc.adicionarVoador(aviao);
        tdc.adicionarVoador(pato);
        tdc.adicionarVoador(superhomem);
        tdc.ImprimirVoadores();

    }
}
