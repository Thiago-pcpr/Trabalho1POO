import java.util.ArrayList;
import java.util.List;

public class Entrega {

    private Cliente cliente_entrega;
    private List<ItemEntrega> itensEntrega;
    private float valorTotal;

    public Entrega(Cliente cliente_entrega, List<ItemEntrega> itensEntrega, float valorTotal) {
        this.cliente_entrega = cliente_entrega;
        this.itensEntrega = itensEntrega;
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente_entrega() {
        return cliente_entrega;
    }

    public List<ItemEntrega> getItensEntrega() {
        return itensEntrega;
    }

    public float getValorTotal() {
        return valorTotal;
    }


}
