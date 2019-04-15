package ex5_java_com_objetos;

public class Cliente {
    private String nome;
    private String sobrenome;
    private float Zapzap;

    public Cliente() {
    }
    public Cliente(String nome, String sobrenome, int zapzap) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        Zapzap = zapzap;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getZapzap() {
        return Zapzap;
    }

    public void setZapzap(float zapzap) {
        Zapzap = zapzap;
    }
}
