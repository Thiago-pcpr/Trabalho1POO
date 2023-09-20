import java.util.ArrayList;
import java.util.List;

public class SistemaDePedidos {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Produto Spaguetti = new Produto("1","Spaguetti");
        Produto Canelone = new Produto("2", "Canelone");
        Produto Talharim = new Produto("3", "Talharim");

        produtos.add(Spaguetti);
        produtos.add(Canelone);
        produtos.add(Talharim);
    }
}
