package ex2_java_com_objetos;

public class SessaoDeTreinamento {

    private Integer experiencia;

    public SessaoDeTreinamento() {
    }
    public Integer getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA (jogadorDeFutebol jogador) {
        jogador.correr(10);
        jogador.fazerGol(5, 10, 1);
        jogador.correr(10);
        jogador.setExperiencia(jogador.getExperiencia() + 1);
    }
}
