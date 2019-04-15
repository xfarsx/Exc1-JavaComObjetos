package exc1_herancas_classe_abstrata;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Data nascimento, double salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
    }
    public void calcularImposto (double imposto){
        imposto = salario * imposto;
        System.out.println(imposto);
    }
}
