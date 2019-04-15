package exc1_herancas_classe_abstrata;

public class Cliente extends Pessoa {

    private int codigo;

    public Cliente() {
    }
    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public void imprimeDados() {
        super.imprimeDados();
    }
}
