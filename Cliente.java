public class Cliente {
    public String endereco_cliente;
    public String nome_cliente;
    public String CNPJ_cliente;

    public Cliente(String nome_cliente, String endereco_cliente, String CNPJ_cliente) {
        this.nome_cliente = nome_cliente;
        this.endereco_cliente = endereco_cliente;
        this.CNPJ_cliente = CNPJ_cliente;
    }

    String tipo() {
        return "cliente";
    }
}
