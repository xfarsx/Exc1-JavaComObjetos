package ex3_java_com_objetos;

public class Atleta {

    private String nome;
    private Integer energia;
    private Integer nivel;

    public Atleta() {
    }

    public Atleta(String nome, Integer energia, Integer nivel) {
        this.nome = nome;
        this.energia = energia;
        this.nivel = nivel;
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

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
