public abstract class Cliente {
    private String nome_cliente;
    private String endereco_cliente;
    private String cnpj_cliente;
    private String tipo_cliente;

    public Cliente(String nome_cliente, String endereco_cliente, String cnpj_cliente, String tipo_cliente) {
        this.nome_cliente = nome_cliente;
        this.endereco_cliente = endereco_cliente;
        this.cnpj_cliente = cnpj_cliente;
        this.tipo_cliente = tipo_cliente;
    }
    public String getNome(){
        return nome_cliente;
    }
    public String getEndereco() {
        return endereco_cliente;
    }
    public String getCnpj() {
        return cnpj_cliente;
    }
    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setNome(String nome) {
        this.nome_cliente = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco_cliente = endereco;
    }
    public void setCnpj(String cnpj) {
        this.cnpj_cliente = cnpj;
    }
    public void setTipo_cliente(String tipo){
        this.tipo_cliente = tipo_cliente;
    }
}




















//public class Cliente {
//    public String endereco_cliente;
//    public String nome_cliente;
//    public String CNPJ_cliente;
//
//    public Cliente(String nome_cliente, String endereco_cliente, String CNPJ_cliente) {
//        this.nome_cliente = nome_cliente;
//        this.endereco_cliente = endereco_cliente;
//        this.CNPJ_cliente = CNPJ_cliente;
//    }
//
//    String tipo() {
//        return "cliente";
//    }
//}
