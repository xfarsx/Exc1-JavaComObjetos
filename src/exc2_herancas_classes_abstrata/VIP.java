package exc2_herancas_classes_abstrata;

public class VIP extends Ingresso {

    private double adicional;

    public VIP() {
    }
    public void calcularAdd(){
        double novoValor = getValor() + adicional;
        System.out.println("O valor do Ingresso é R$" + novoValor);
    }
    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    @Override
    public void imprimeValor() {
        super.imprimeValor();
    }
}
