package exc1_herancas_classe_abstrata;

public class Gerente extends Funcionario {

    private String area;

    public Gerente() {
    }

    public Gerente(String nome, Data nascimento, double salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
    }
    @Override
    public void calcularImposto(double imposto) {
        super.calcularImposto(imposto);
    }
}
