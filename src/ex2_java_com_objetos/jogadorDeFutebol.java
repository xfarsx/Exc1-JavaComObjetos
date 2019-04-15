package ex2_java_com_objetos;

public class jogadorDeFutebol {
    private String nome;
    private Integer energia;
    private Integer alegria;
    private Integer gols;
    private Integer experiencia;

    public jogadorDeFutebol() {
    }
    public jogadorDeFutebol(String nome, Integer energia, Integer alegria, Integer gols, Integer experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getAlegria() {
        return alegria;
    }

    public void setAlegria(Integer alegria) {
        this.alegria = alegria;
    }

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public void fazerGol(int gastarNRG, int maisAlegria, int gol){
        energia = energia - gastarNRG;
        alegria = alegria + maisAlegria;
        gols = gols + gol;
        System.out.println("GOOOL!");
    }
    public void correr (int gastarNRG){
        energia = energia - gastarNRG;
        System.out.println ("Cansei!!!");
    }

}
