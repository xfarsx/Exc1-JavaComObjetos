package exc2_herancas_classes_abstrata;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        int digitar;

        Ingresso ingresso = new Ingresso(250.00);
        Normal normal = new Normal();
        VIP vip = new VIP(250, 100);
        CamaroteInferior cminf = new CamaroteInferior(25);
        CamaroteSuperior cmsup = new CamaroteSuperior(250,100,150);

        System.out.println("Bem vindo a Trump Town!");
        System.out.println("========================");
        System.out.println("Qual Ingresso Deseja comprar?");
        System.out.println("Digite (1) para Normal (2) para VIP");
        Scanner sc = new Scanner(System.in);
        digitar = sc.nextInt();
        if (digitar == 1) {
            ingresso.imprimeValor();
            normal.imprimeValor();
        } else if (digitar == 2) {
            System.out.println("Digite (1) para Camarote Inferior (2) para Camarote Superior");
            Scanner sc1 = new Scanner(System.in);
            digitar = sc1.nextInt();
            if (digitar == 1) {
                vip.calcularAdd();
                System.out.println();
                System.out.print("Sua localização é ");
                cminf.mostratLocalizacao();
            } else if (digitar == 2) {
                cmsup.calcularMaisCaro();
            }
        }
    }
}

