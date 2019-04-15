package ex3_java_com_objetos;

public class Exercicio3 {

    public static void main(String[] args) {

        Atleta atleta1 = new Atleta ("Connor McGregor", 60 , 100);
        Atleta atleta2 = new Atleta ("Floyd Mayweather", 100 , 80);
        Prova boxe = new Prova(80,100);
        Prova mma = new Prova(100,60);
        Prova musculacao = new Prova(30,30);

        System.out.println("===========");
        System.out.println("Lutar Boxe");
        System.out.println("===========");
        System.out.println("Nome: " + atleta1.getNome());
        System.out.println("Energia: " + atleta1.getEnergia());
        System.out.println("Nível: " + atleta1.getNivel());
        boxe.podeRealizar(atleta1);
        System.out.println("===========");
        System.out.println("Nome: " + atleta2.getNome());
        System.out.println("Energia: " + atleta2.getEnergia());
        System.out.println("Nível: " + atleta2.getNivel());
        boxe.podeRealizar(atleta2);
        System.out.println("");
        System.out.println("===========");
        System.out.println("Lutar Mixed Martial Arts");
        System.out.println("===========");
        System.out.println("Nome: " + atleta1.getNome());
        System.out.println("Energia: " + atleta1.getEnergia());
        System.out.println("Nível: " + atleta1.getNivel());
        mma.podeRealizar(atleta1);
        System.out.println("===========");
        System.out.println("Nome: " + atleta2.getNome());
        System.out.println("Energia: " + atleta2.getEnergia());
        System.out.println("Nível: " + atleta2.getNivel());
        mma.podeRealizar(atleta2);
        System.out.println("");
        System.out.println("===========");
        System.out.println("Fazer Musculação");
        System.out.println("===========");
        System.out.println("Nome: " + atleta1.getNome());
        System.out.println("Energia: " + atleta1.getEnergia());
        System.out.println("Nível: " + atleta1.getNivel());
        musculacao.podeRealizar(atleta1);
        System.out.println("===========");
        System.out.println("Nome: " + atleta2.getNome());
        System.out.println("Energia: " + atleta2.getEnergia());
        System.out.println("Nível: " + atleta2.getNivel());
        musculacao.podeRealizar(atleta2);
        System.out.println("");
    }
}
