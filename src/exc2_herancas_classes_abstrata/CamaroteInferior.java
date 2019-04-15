package exc2_herancas_classes_abstrata;

public class CamaroteInferior extends VIP {

    private int localizacao;

    public CamaroteInferior() {
    }
    public CamaroteInferior( int localizacao) {
        this.localizacao = localizacao;
    }
    public int getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }
    public void mostratLocalizacao(){
        System.out.println(getLocalizacao());
    }
    @Override
    public void imprimeValor() {
        super.imprimeValor();
    }
}
