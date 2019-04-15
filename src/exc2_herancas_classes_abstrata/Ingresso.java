package exc2_herancas_classes_abstrata;

import java.sql.SQLOutput;

public class Ingresso {

    private double valor;

    public Ingresso() {
    }
    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void imprimeValor(){
        System.out.println("Valor do Ingresso é R$" + valor);
    }
}
