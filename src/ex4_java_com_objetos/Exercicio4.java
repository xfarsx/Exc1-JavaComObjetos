package ex4_java_com_objetos;

public class Exercicio4 {

    public static void main(String[] args) {

        Tripe tripe1 = new Tripe (2,4,2);
        System.out.println("=============================");
        System.out.println("A Altura do Tripé é = " + tripe1.getAlturaAtual());
        System.out.println("Altura ajustada ");
        System.out.println("=============================");
        tripe1.Altura(4);
        System.out.println("=============================");
        System.out.println("A Altura do Tripé é = " + tripe1.getAlturaAtual());
        System.out.println("=============================");
        tripe1.prontoParaUsar();
        System.out.println("=============================");
        System.out.println("Altura ajustada para Guardar!");
        tripe1.Guardar();
        System.out.println("=============================");
        System.out.println("A Altura do Tripé é = " + tripe1.getAlturaAtual());
        System.out.println("=============================");
        tripe1.prontoParaGuardar();
    }
}
