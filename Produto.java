public class Produto {
    public float preco_kg_produto;
    public String forma_produto;

    public Produto (float preco_kg_produto, String forma_produto){
        this.preco_kg_produto = preco_kg_produto;
        this.forma_produto = forma_produto;
    }

    public String getForma_produto() {
        return forma_produto;
    }

    public float getPreco_kg_produto() {
        return preco_kg_produto;
    }
}
