package ex1_java_com_objetos;

public class Conta {
    private Integer numeroDaConta;
    private Double saldo;
    private String titular;

    public Conta() {
    }

    public Conta(Integer numeroDaConta, Double saldo, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposito(double qtdDinheiro){
        saldo = saldo + qtdDinheiro;
        System.out.println("Depósito realizado!");
        System.out.println("Quantia depositada = " + qtdDinheiro);
        System.out.println("Seu novo saldo é " + saldo);
    }
    public void saque (double novoSaque){
        saldo = saldo - novoSaque;
        System.out.println("Saque realizado!");
        System.out.println("Quantia sacada = " + novoSaque);
        System.out.println("Seu novo saldo é " + saldo);}
}

