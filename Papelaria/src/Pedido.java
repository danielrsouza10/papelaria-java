public class Pedido {
    private String codigo;
    private Cliente cliente;
    private List produtos;
    private double total;
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List getProdutos() {
        return produtos;
    }
    public void setProdutos(List produtos) {
        this.produtos = produtos;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    

}
