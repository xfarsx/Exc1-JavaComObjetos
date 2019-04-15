package exc1_java_com_interfaces;
import java.util.ArrayList;
import java.util.List;


public class Impressora {

    List<Imprimivel> imprimiveis = new ArrayList<>();

    public void adicionarImprimivel (Imprimivel umImprimivel){
        imprimiveis.add(umImprimivel);

    }
    public void ImprimirTudo(){
        for (Imprimivel imprimivel : imprimiveis){
            imprimivel.imprimir();
        }
    }
}
