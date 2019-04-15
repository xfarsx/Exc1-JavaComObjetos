package ex1_java_com_objetos;


public class Exercicio1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Fernando","Santos");
        Cliente cliente2 = new Cliente("Erick","Stefan");
        Conta conta1 = new Conta(2425,4423.98,"Fernando");
        Conta conta2 = new Conta(2720,3445.42,"Erick");

        System.out.println("Cliente = " + cliente1.getNome() + " " +  cliente1.getSobrenome());
        System.out.println("Numero da Conta: " + conta1.getNumeroDaConta());
        System.out.println("");//pula linha
        System.out.println("=========== Executando Depósito ==========");
        System.out.println("");//pula linha
        conta1.deposito(450);
        System.out.println("");//pula linha
        System.out.println("=========== Outra Execução ==========");
        System.out.println("");//pula linha
        System.out.println("Cliente = " + cliente2.getNome() + " " +  cliente2.getSobrenome());
        System.out.println("Numero da Conta: " + conta2.getNumeroDaConta());
        System.out.println("");//pula linha
        System.out.println("=========== Executando Saque ==========");
        System.out.println("");//pula linha
        conta2.saque(230);
    }
}
