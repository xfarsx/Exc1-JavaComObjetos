package ex5_java_com_objetos;

public class Venda {
    private Cliente cliente;
    private Carro veiculo;
    private String valorDavenda;
    public Venda() {
    }
    public Venda(Cliente cliente, Carro veiculo, String valorDavenda) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorDavenda = valorDavenda;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Carro veiculo) {
        this.veiculo = veiculo;
    }

    public String getValorDavenda() {
        return valorDavenda;
    }

    public void setValorDavenda(String valorDavenda) {
        this.valorDavenda = valorDavenda;
    }
}
