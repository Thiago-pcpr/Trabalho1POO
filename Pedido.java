public class Pedido {
    public int numero_unico_pedido;
    Cliente x = new Cliente();
    public String CNPJ_pedido = x.CNPJ_cliente;
    Produto y = new Produto();
    public String forma_pedido = y.forma_produto;
    public float quantidade_pedido;
}
