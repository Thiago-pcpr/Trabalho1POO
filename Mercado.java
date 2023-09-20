public class Mercado extends Cliente{
    public Mercado(String nome_cliente, String endereco_cliente, String CNPJ_cliente, String tipo_cliente) {
        super(nome_cliente, endereco_cliente, CNPJ_cliente, "Mercado");
    }

    String tipo() {
        return "Mercado";
    }
}
