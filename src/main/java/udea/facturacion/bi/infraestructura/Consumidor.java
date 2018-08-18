package udea.facturacion.bi.infraestructura;

import com.google.gson.Gson;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;
import udea.facturacion.bi.controllers.BusinessIntelligence;
import udea.facturacion.bi.modelo.DtoFactura;

@Component
public class Consumidor implements MessageListener {
    @Override
    public void onMessage(Message message) {
        Gson gson = new Gson();
        DtoFactura factura = gson.fromJson(new String(message.getBody()), DtoFactura.class);
        BusinessIntelligence.ingresar(factura);
    }
}