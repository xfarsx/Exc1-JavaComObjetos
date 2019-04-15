package exc2_java_com_objetos;
import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    List<Voador> voadores = new ArrayList<>();

    public void adicionarVoador(Voador umVoador) {
        voadores.add(umVoador);

    }

    public void ImprimirVoadores() {
        for (Voador voador : voadores) {
            voador.voar();
        }
    }
}