package exc2_java_com_objetos;

public class Super_Homem implements Voador{
    int experiencia;

    public Super_Homem() {
    }
    public Super_Homem(int experiencia) {
        this.experiencia = experiencia;
    }
    @Override
    public void voar() {
    experiencia = experiencia + 3;
        System.out.println("Estou voando como um campeão e tenho " + experiencia + " de experiência.");
    }
}
