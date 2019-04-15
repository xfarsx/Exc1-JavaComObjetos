package ex5_java_com_objetos;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        String valorDavenda;
        int confirmacao;

        Cliente cliente1 = new Cliente ("Fernando", "Santos",99995412);
        Carro carro1 = new Carro ("Hyundai","HB20",2018,"Vermelho",2000);
        Concessionaria registro = new Concessionaria();
        System.out.println("Registro de Venda");
        System.out.println("=================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da venda: ");
        valorDavenda = sc.next();
        System.out.println("=================");
        System.out.println("Registrando...");
        System.out.println("=================");
        System.out.println("Registro realizado com sucesso!");
        System.out.println("=================");
        registro.registrarVenda(carro1,cliente1,valorDavenda);
        System.out.println("=================");
        System.out.println("Verificar lista de Vendas? (1 = Sim /0 = Não)");
        System.out.println("=================");
        confirmacao = sc.nextInt();
        if (confirmacao == 1){
            System.out.println("=============");
            System.out.println("Lista de Vendas registras");
            System.out.println("=================");
            for (int i = 0; i<registro.getVendas().size(); i++){//Não funciona, provavelmente por ter int e String rodando juntos.
            System.out.println(registro.getVendas().get(i));}
        }
        else{
            System.out.println("Esperando novo regsitro...");}
    }
}
