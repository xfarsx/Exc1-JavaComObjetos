package exc2_herancas_classes_abstrata;

public class CamaroteSuperior extends VIP{


    private double maisCaro;

    public void calcularMaisCaro(){
        double novoValor = getValor() + maisCaro + getAdicional();
        System.out.println("O valor do Ingresso é R$" + novoValor);}
    public CamaroteSuperior() {
    }
    public CamaroteSuperior(double valor, double adicional, double maisCaro) {
        super(valor, adicional);
        this.maisCaro = maisCaro;
    }

    public double getMaisCaro() {
        return maisCaro;
    }

    public void setMaisCaro(double maisCaro) {
        this.maisCaro = maisCaro;
    }
    @Override
    public void imprimeValor() {
        super.imprimeValor();
    }
}
