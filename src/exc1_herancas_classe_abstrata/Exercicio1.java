package exc1_herancas_classe_abstrata;

import javax.swing.plaf.synth.SynthIcon;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Exercicio1 {
    public static void main(String[] args) {

        int confirmacao;

        Data data1 = new Data (11,02,1989);//define Data do cliente
        Cliente cliente1 = new Cliente("Fernando",data1,1000); //Define dados do cliente
        Data data2 = new Data (06,10,1984);
        Cliente cliente2 = new Cliente("Erick",data2,1001);
        Data data3 = new Data (16,06,1989);
        Cliente cliente3 = new Cliente("Barbara",data3,1002);
        Data data4 = new Data (06,01,1983);
        Cliente cliente4 = new Cliente("Natalia",data4,1003);
        CadastroPessoas cdpessoas = new CadastroPessoas();
        Funcionario funcionario  = new Funcionario("Erick",data2,5000);
        Gerente gerente = new Gerente("Fernando",data1,10000,"Comercial");
        System.out.println("Quantidade de Pessoas cadastradas: " + cdpessoas.getQtdAtual());
        System.out.println("================");
        System.out.println("Cadastrando...");
        System.out.println("================");
        cliente1.imprimeDados();//Imprime os dados do cliente
        System.out.println("Código Gerado: " + cliente1.getCodigo());//mostra o código anteriormente definido
        cdpessoas.cadastroPessoa(cliente1);
        cliente2.imprimeDados();
        System.out.println("Código Gerado: " + cliente2.getCodigo());
        cdpessoas.cadastroPessoa(cliente2);
        cliente3.imprimeDados();
        System.out.println("Código Gerado: " + cliente3.getCodigo());
        cdpessoas.cadastroPessoa(cliente3);
        cliente4.imprimeDados();
        System.out.println("Código Gerado: " + cliente4.getCodigo());
        cdpessoas.cadastroPessoa(cliente4);
        System.out.println("================");
        System.out.println("Pessoas Cadastradas!");
        System.out.println("================");
        System.out.println("Quantidade de Pessoas cadastradas: " + cdpessoas.novoqtdAtual(0));//mostra a quantidade de pessoas cadastradas
        System.out.println("================");
        System.out.println("Deseja verificar lista de pessoas cadastradas? (1 = Sim / Outro número = Não)");
        Scanner sc = new Scanner(System.in);
        confirmacao = sc.nextInt();
        if (confirmacao == 1){//confirma se a pessoas quer ver a lista de cadastrado ou não.
            cdpessoas.imprimeCadastro();
        }
        else{
            System.out.println("Continuando o programa...");
        }
        System.out.println("================");
        System.out.println("Novo Funcionário");
        System.out.println("================");
        funcionario.imprimeDados();
        System.out.println("Salario definido: " + funcionario.getSalario());//mostra salario
        System.out.println("================");
        System.out.println("Calculando Imposto...");
        System.out.println("================");
        System.out.println("O Imposto a pagar é ");
        funcionario.calcularImposto(0.03);//calcula o imposto
        System.out.println("================");
        System.out.println("Novo Gerente");
        System.out.println("================");
        gerente.imprimeDados();
        System.out.println("Salario definido: " + gerente.getSalario());
        System.out.println("================");
        System.out.println("Calculando Imposto...");
        System.out.println("================");
        System.out.println("O Imposto a pagar é ");
        gerente.calcularImposto(0.05);

    }

}
