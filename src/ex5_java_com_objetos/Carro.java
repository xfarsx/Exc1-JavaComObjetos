package ex5_java_com_objetos;

public class Carro {

    private String marca;
    private String modelo ;
    private int anoDeFab;
    private String cor;
    private double km;

    public Carro() {
    }
    public Carro(String marca, String modelo, int anoDeFab, String cor, double km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFab = anoDeFab;
        this.cor = cor;
        this.km = km;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFab() {
        return anoDeFab;
    }

    public void setAnoDeFab(int anoDeFab) {
        this.anoDeFab = anoDeFab;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
