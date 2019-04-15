package exc1_herancas_classe_abstrata;

public abstract class Pessoa {
    private String nome;
    private Data nascimento = new Data ();

    public Pessoa() {
    }

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
    public void imprimeDados (){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + nascimento.getDia() + "/" + nascimento.getMes() + "/" + nascimento.getAno());
    }
}
