package ex3_java_com_objetos;

public class Prova {

    private Integer dificuldade;
    private Integer energianecessaria;

    public Prova() {
    }

    public Prova(Integer dificuldade, Integer energianecessaria) {
        this.dificuldade = dificuldade;
        this.energianecessaria = energianecessaria;
    }

    public Integer getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Integer dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Integer getEnergianecessaria() {
        return energianecessaria;
    }

    public void setEnergianecessaria(Integer energianecessaria) {
        this.energianecessaria = energianecessaria;
    }

    public void podeRealizar (Atleta atleta){
        if( atleta.getEnergia() >= energianecessaria && atleta.getNivel() >= dificuldade){
            System.out.println("Apto para realizar!");
        }
        else{
            System.out.println("Tem que treinar mais!");
        }

    }
}
