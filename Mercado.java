public class Mercado extends Cliente{
    public Mercado(String nome_cliente, String endereco_cliente, String CNPJ_cliente) {
        super(nome_cliente, endereco_cliente, CNPJ_cliente);
    }

    String tipo() {
        return "Mercado";
    }
}