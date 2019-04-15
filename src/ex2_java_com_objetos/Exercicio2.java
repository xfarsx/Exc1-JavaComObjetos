package ex2_java_com_objetos;

public class Exercicio2 {
    public static void main(String[] args) {

        jogadorDeFutebol jogador1 = new jogadorDeFutebol("Marcelinho", 20, 12, 14, 8);
        jogadorDeFutebol jogador2 = new jogadorDeFutebol("Wallace", 22, 8, 7, 5);
        SessaoDeTreinamento sessaodetreinamento = new SessaoDeTreinamento();

        System.out.println("=======================");
        System.out.println("Entrando no treinamento");
        System.out.println("=======================");
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Ficha do jogador");
        System.out.println("=======================");
        System.out.println("Nome = " + jogador1.getNome());
        System.out.println("Energia = " + jogador1.getEnergia());
        System.out.println("Alegria = " + jogador1.getAlegria());
        System.out.println("Gols = " + jogador1.getGols());
        System.out.println("Experiência = " + jogador1.getExperiencia());
        System.out.println("=======================");
        System.out.println("");
        System.out.println("Treinando...");
        System.out.println("");
        System.out.println("=======================");
        sessaodetreinamento.treinarA(jogador1);
        System.out.println("=======================");
        System.out.println("");
        System.out.println("Fim do Treino");
        System.out.println("Experiência = " + jogador1.getExperiencia());

        System.out.println("=======================");
        System.out.println("Entrando no treinamento");
        System.out.println("=======================");
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Ficha do jogador");
        System.out.println("=======================");
        System.out.println("Nome = " + jogador2.getNome());
        System.out.println("Energia = " + jogador2.getEnergia());
        System.out.println("Alegria = " + jogador2.getAlegria());
        System.out.println("Gols = " + jogador2.getGols());
        System.out.println("Experiência = " + jogador2.getExperiencia());
        System.out.println("=======================");
        System.out.println("");
        System.out.println("Treinando...");
        System.out.println("");
        System.out.println("=======================");
        sessaodetreinamento.treinarA(jogador2);
        System.out.println("=======================");
        System.out.println("");
        System.out.println("Fim do Treino");
        System.out.println("Experiência = " + jogador2.getExperiencia());
    }
}
