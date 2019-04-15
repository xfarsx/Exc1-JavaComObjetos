package ex5_java_com_objetos;
import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    private List<Venda> vendas= new ArrayList <> ();

    public Concessionaria() {
    }

    public Concessionaria(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public List<Venda> getVendas() {
        return vendas;
    }
    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public void registrarVenda (Carro carro, Cliente cliente, String valor) {
        Venda venda = new Venda ();
        venda.setCliente(cliente);
        venda.setVeiculo(carro);
        venda.setValorDavenda(valor);
        vendas.add(venda);
        System.out.println("Carro Vendido: " + carro.getModelo());
        System.out.println("Comprado por: " + cliente.getNome() + " " + cliente.getSobrenome());
        System.out.println("Valor da venda: " + valor);
    }
    public void mostrarLista(int i){
        for (i = 0; i<vendas.size(); i++){
            System.out.println(vendas);
        }
    }
}
