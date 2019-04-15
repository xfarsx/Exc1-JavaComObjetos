package exc1_herancas_classe_abstrata;
import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
    private int qtdAtual;
    private List<Pessoa> pessoas = new ArrayList<>();


    public CadastroPessoas() {
    }

    public CadastroPessoas(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
public void cadastroPessoa (Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public Integer novoqtdAtual(int novoQtda){
        novoQtda = pessoas.size();
        return novoQtda;//mostra tamanho do array na tela
    }
    public void imprimeCadastro(){
        for (int i =0; i<pessoas.size(); i++){//imprimi nome na tela
            System.out.println("Nome: " + pessoas.get(i).getNome());
        }
    }
}
