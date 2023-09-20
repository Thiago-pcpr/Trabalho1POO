public class Pedido {
    private int numeroUnico_pedido;
    private Cliente cliente_pedido;
    private Produto produto_pedido;
    private float quantidade_pedido;

    public Pedido(int numeroUnico_pedido, Cliente cliente_pedido, Produto produto_pedido, float quantidade_pedido) {
        this.numeroUnico_pedido = numeroUnico_pedido;
        this.cliente_pedido = cliente_pedido;
        this.produto_pedido = produto_pedido;
        this.quantidade_pedido = quantidade_pedido;
    }

    // Métodos getters para acessar os atributos
    public int getNumeroUnicoPedido() {
        return numeroUnico_pedido;
    }

    public Cliente getCliente() {
        return cliente_pedido;
    }

    public Produto getProduto() {
        return produto_pedido;
    }

    public float getQuantidadePedido() {
        return quantidade_pedido;
    }
}
