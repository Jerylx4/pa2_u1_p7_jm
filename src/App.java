import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {

        Pedido pedido = new Pedido("Juan Perez", "laptop", 1500.00, "juanp@gmail.com"); // creamos manualmente el objeto
                                                                                        // de la calse pedido
        PedidoService pS = new PedidoService(); // creamos manualmente el objeto de la clase PedidoService
        pS.realizar(pedido);

        pedido = null; // el objeto sea elegible por el GC
        pS = null; // el objeto es elegible por el GC
        
        //Prueba de subida en una nueva rama
    }
}
