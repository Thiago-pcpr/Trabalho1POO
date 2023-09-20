public class Restaurante extends Cliente{
    public Restaurante(String nome_cliente, String endereco_cliente, String CNPJ_cliente) {
        super(nome_cliente, endereco_cliente, CNPJ_cliente);
    }

    String tipo() {
        return "Restaurante";
    }
}
